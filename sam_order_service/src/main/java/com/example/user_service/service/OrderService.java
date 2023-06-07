package com.example.user_service.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

public interface OrderService<T> {

  public ResponseEntity<T> createOrder();

  public ResponseEntity<T> getOrder();

  public ResponseEntity<T> updateOrder();

  public ResponseEntity<T> deleteOrder();
}
