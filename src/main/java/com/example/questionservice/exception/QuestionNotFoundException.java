package com.example.questionservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class QuestionNotFoundException extends RuntimeException {

  public QuestionNotFoundException(String message) {
    super(message);
  }

  public QuestionNotFoundException() {
  }
}
