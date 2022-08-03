package com.example.demo8888888.controller;

import com.example.demo8888888.model.Book;
import com.example.demo8888888.service.BookService;
import com.example.demo8888888.util.QueryParams;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


  private final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/books?{queryParams}")
  public List<Book> getBooks(QueryParams queryParams) {
    return bookService.findAllByParams(queryParams);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/books/{url}")
  public Optional<Book> getBook(@PathVariable("url") String url) {
    return bookService.findByUrl(url);
  }
}
