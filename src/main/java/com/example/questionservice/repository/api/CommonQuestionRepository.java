package com.example.questionservice.repository.api;

import com.example.questionservice.model.Question;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

public class CommonQuestionRepository implements QuestionRepository {

  protected final Set<Question> questions = new HashSet<>();

  @Override
  public Question add(Question question) {
    boolean isAdded = questions.add(question);
    if (!isAdded) {
      return null;
    }
    return question;
  }

  @Override
  public Question remove(Question question) {
    questions.remove(question);
    return question;
  }

  @Override
  public Collection<Question> getAll() {
    return new HashSet<>(questions);
  }
}
