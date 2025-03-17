package com.example.questionservice.service.api;

import com.example.questionservice.model.Question;
import java.util.Collection;

public interface ExaminerService {

  Collection<Question> getQuestion(int amount);

}
