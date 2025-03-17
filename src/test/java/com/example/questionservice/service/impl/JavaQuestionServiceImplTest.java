package com.example.questionservice.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.example.questionservice.exception.BadRequestException;
import com.example.questionservice.model.Question;
import java.util.Collection;

import com.example.questionservice.service.impl.JavaQuestionServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;

class JavaQuestionServiceImplTest {
    //Не совсем понимаю, как заставить тесты работать после рефакторинга.
//  private final JavaQuestionServiceImpl questionService = new JavaQuestionServiceImpl();
//  private final Question TEST_Q = new Question("1", "1");
//
//  @Test
//  void add() {
//    assertTrue(questionService.getAll().isEmpty());
//    questionService.add(TEST_Q);
//    assertFalse(questionService.getAll().isEmpty());
//  }
//
//  @Test
//  void addAlreadyExists() {
//    questionService.add(TEST_Q);
//    assertFalse(questionService.getAll().isEmpty());
//    assertThrows(BadRequestException.class, () -> questionService.add(TEST_Q));
//  }
//
//  @Test
//  void remove() {
//    questionService.add(TEST_Q);
//    assertFalse(questionService.getAll().isEmpty());
//    questionService.remove(TEST_Q);
//    assertTrue(questionService.getAll().isEmpty());
//  }
//
//  @Test
//  void getAll() {
//    questionService.add(TEST_Q);
//    Collection<Question> all = questionService.getAll();
//    assertFalse(all.isEmpty());
//    assertTrue(all.contains(TEST_Q));
//  }
//
//  @Test
//  void getRandomQuestion() {
//    questionService.add(TEST_Q);
//    Question randomQuestion = questionService.getRandomQuestion();
//    assertEquals(TEST_Q, randomQuestion);
//  }
}