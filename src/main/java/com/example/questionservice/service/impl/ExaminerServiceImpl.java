package com.example.questionservice.service.impl;

import com.example.questionservice.exception.BadRequestException;
import com.example.questionservice.model.Question;
import com.example.questionservice.service.api.ExaminerService;
import com.example.questionservice.service.api.QuestionService;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExaminerServiceImpl implements ExaminerService {

  private final List<QuestionService> services;
  private final Random random = new Random();

  @Override
  public Collection<Question> getQuestion(int amount) {//Сумма всех вопросов из обеих тем
    int sumQuestions = services.stream()
        .mapToInt(it -> it.getAll().size())
        .sum();

    if (amount > sumQuestions) {
      throw new BadRequestException();
    }

    Set<Question> questions = new HashSet<>();
    while (amount > questions.size()) {
      QuestionService service = services.get(random.nextInt(services.size()));
      Optional.ofNullable(service.getRandomQuestion())
              .ifPresent(questions::add);
    }

    return questions;
  }
}
