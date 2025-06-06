package com.example.questionservice.repository.api;

import com.example.questionservice.model.Question;
import java.util.Collection;

public interface QuestionRepository {
  Question add(Question question);
  Question remove(Question question);
  Collection<Question> getAll();
}
