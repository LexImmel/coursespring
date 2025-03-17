package com.example.questionservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = "question")//считает правильным только первый добавленный вопрос, даже если добавлять этот вопрос с другим ответом
@NoArgsConstructor
@AllArgsConstructor
public class Question {
  private String question;
  private String answer;
}
