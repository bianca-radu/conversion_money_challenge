package com.example.demo8888888.util;

import com.example.demo8888888.model.Book;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class ClientFallback implements Client {

  @Override
  public List<Book> getBooks(QueryParams queryParams) {
    return Collections.emptyList();
  }

  @Override
  public Optional<Book> getBook(String url) {
    return Optional.empty();
  }
}