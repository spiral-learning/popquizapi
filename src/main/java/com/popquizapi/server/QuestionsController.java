package com.popquizapi.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuestionsController {

  @GetMapping
  public Questions questionList() {
    Questions questions = new Questions();
    
    return questions;
  }

}
