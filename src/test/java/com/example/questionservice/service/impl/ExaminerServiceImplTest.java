package com.example.questionservice.service.impl;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.questionservice.exception.BadRequestException;
import com.example.questionservice.model.Question;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

//  @Mock
//  private JavaQuestionServiceImpl questionService;
//  private final Question TEST_Q = new Question("1", "1");
//  private final Question TEST_Q_2 = new Question("2", "2");
//  private final Question TEST_Q_3 = new Question("3", "3");
//
//  @InjectMocks
//  private ExaminerServiceImpl examinerService;
//
//
//  @Test
//  void getQuestion() {
//    Mockito.when(questionService.getAll())
//            .thenReturn(Arrays.asList(TEST_Q, TEST_Q_2, TEST_Q_3));
//    Mockito.when(questionService.getRandomQuestion())
//        .thenReturn(TEST_Q, TEST_Q_2, TEST_Q_3);
//
//    Collection<Question> question = examinerService.getQuestion(3);
//    assertTrue(question.containsAll(Arrays.asList(TEST_Q, TEST_Q_2, TEST_Q_3)));
//  }
//
//  @Test
//  void getQuestionAmountToBig() {
//    assertThrows(BadRequestException.class, () -> examinerService.getQuestion(1));
//  }

}