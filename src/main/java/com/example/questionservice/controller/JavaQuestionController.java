package com.example.questionservice.controller;

import com.example.questionservice.model.Question;
import com.example.questionservice.service.api.QuestionService;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam/java")
@RequiredArgsConstructor
public class JavaQuestionController {

  private final QuestionService javaQuestionServiceImpl;


  @GetMapping
  public Question add(@RequestParam String question, @RequestParam String answer) {
    return javaQuestionServiceImpl.add(question, answer);
  }

  @GetMapping("/all")
  public Collection<Question> getAll() {
    return javaQuestionServiceImpl.getAll();
  }

  @GetMapping("/remove")
  public Question remove(@RequestParam String question, @RequestParam String answer) {
    return javaQuestionServiceImpl.remove(new Question(question, answer));
  }

}
