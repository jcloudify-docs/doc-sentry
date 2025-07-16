package com.example.demo.endpoint.rest.controller;

import io.sentry.Sentry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

  @GetMapping("/error")
  public String getError() {
    Sentry.captureException(new RuntimeException("Sentry Exception"));
    return "error";
  }
}
