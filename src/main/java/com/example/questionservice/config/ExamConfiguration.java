package com.example.questionservice.config;

import com.example.questionservice.repository.api.CommonQuestionRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExamConfiguration {

  @Bean
  public CommonQuestionRepository javaQuestionRepository(){
    return new CommonQuestionRepository();
  }

//  @Bean
//  public CommonQuestionRepository mathQuestionRepository(){
//    return new CommonQuestionRepository();
//  }
  //Бин закрыт для создания оч сложного уровня
}
