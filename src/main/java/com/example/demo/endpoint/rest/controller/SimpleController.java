package com.example.demo.endpoint.rest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SimpleController {

  @GetMapping("/test")
  public String test() {
    throw new RuntimeException("Error from remote URI");
  }
}
