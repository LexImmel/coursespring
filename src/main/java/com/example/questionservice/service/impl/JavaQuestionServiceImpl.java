package com.example.questionservice.service.impl;

import com.example.questionservice.exception.BadRequestException;
import com.example.questionservice.exception.QuestionNotFoundException;
import com.example.questionservice.model.Question;
import com.example.questionservice.repository.api.QuestionRepository;
import com.example.questionservice.service.api.QuestionService;
import java.util.Collection;
import java.util.Random;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JavaQuestionServiceImpl implements QuestionService {

  private final QuestionRepository repository;
  private final Random random = new Random();

  public JavaQuestionServiceImpl(@Qualifier("javaQuestionRepository") QuestionRepository repository) {
    this.repository = repository;
  }

  @Override
  public Question add(String question, String answer) {
    return add(new Question(question, answer));
  }

  @Override
  public Question add(Question question) {
    Question q = repository.add(question);
    if (q == null) {
      throw new BadRequestException("Такой вопрос уже существует");
    }
    return q;
  }

  @Override
  public Question remove(Question question) {
    return repository.remove(question);
  }

  @Override
  public Collection<Question> getAll() {
    return repository.getAll();
  }

  @Override
  public Question getRandomQuestion() {
    if (repository.getAll().isEmpty()) {
      return null;
    }
    return repository.getAll().stream()
        .skip(random.nextInt(repository.getAll().size()))
        .findFirst()
        .orElseThrow(QuestionNotFoundException::new);
  }
}
