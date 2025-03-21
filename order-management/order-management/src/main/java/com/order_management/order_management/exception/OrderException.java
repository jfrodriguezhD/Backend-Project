package com.order_management.order_management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderException extends RuntimeException {

  public OrderException(String message) {
    super(message);
  }
}
