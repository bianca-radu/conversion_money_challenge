package com.example.demo8888888.service;

import com.example.demo8888888.model.Book;
import com.example.demo8888888.util.QueryParams;
import java.util.List;
import java.util.Optional;


public interface BookService {

  List<Book> findAllByParams(QueryParams queryParams);

  Optional<Book> findByUrl(String url);
}
