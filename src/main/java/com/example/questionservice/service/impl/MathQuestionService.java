package com.example.questionservice.service.impl;

import com.example.questionservice.model.Question;
import com.example.questionservice.service.api.QuestionService;
import java.util.Collection;
import java.util.Random;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MathQuestionService implements QuestionService {

  private final Random random = new Random();

  @Override
  public Question add(String question, String answer) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Question add(Question question) {
    throw new UnsupportedOperationException();

  }

  @Override
  public Question remove(Question question) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Collection<Question> getAll() {
    throw new UnsupportedOperationException();
  }

  @Override
  public Question getRandomQuestion() {
    int first = random.nextInt();
    int second = random.nextInt();
    String question = "";
    String answer = "";
    switch (random.nextInt(4)) {//Выбор случайной операции из 4-х установленных
      case 0 -> {
        question = first + " + " + second + " = ?";
        answer = String.valueOf(first + second);
      }
      case 1 -> {
        question = first + " - " + second + " = ?";
        answer = String.valueOf(first - second);
      }
      case 2 -> {
        question = first + " * " + second + " = ?";
        answer = String.valueOf(first * second);
      }
      case 3 -> {
        question = first + " / " + second + " = ?";
        answer = String.valueOf(first / second);
      }
    }
    return new Question(
        question,
        answer + "."
    );
  }
}
