package com.example.questionservice.controller;

import com.example.questionservice.model.Question;
import com.example.questionservice.service.api.ExaminerService;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ExamController {

  private final ExaminerService examinerService;

  @GetMapping("/exam")
  public Collection<Question> getQuestions(@RequestParam int amount){
    return examinerService.getQuestion(amount);
  }

}
