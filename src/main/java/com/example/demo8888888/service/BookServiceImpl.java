package com.example.demo8888888.service;

import com.example.demo8888888.model.Book;
import com.example.demo8888888.repository.BookRepository;
import com.example.demo8888888.util.QueryParams;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;

  public BookServiceImpl(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public List<Book> findAllByParams(QueryParams queryParams) {
    int pageSize = queryParams.getPageSize();
    int page = queryParams.getPage();
    int fromIndex = (pageSize * (page - 1)) + 1;
    int toIndex = pageSize * page;
    List<Book> books = bookRepository.findAll().subList(fromIndex, toIndex);

    boolean bookNameBool = queryParams.getBookName() != null;
    Predicate<Book> namePredicate =
        bookNameBool ? book -> queryParams.getBookName().equals(book.getName()) : null;

    boolean toReleaseDateBool = queryParams.getToReleaseDate() != null;
    Predicate<Book> toReleaseDatePredicate =
        toReleaseDateBool ? book -> LocalDate.parse(book.getReleased())
            .isBefore(queryParams.getToReleaseDate()) : null;

    boolean fromReleaseDateBool = queryParams.getFromReleaseDate() != null;
    Predicate<Book> fromReleaseDatePredicate =
        fromReleaseDateBool ? book -> LocalDate.parse(book.getReleased())
            .isAfter(queryParams.getFromReleaseDate()) : null;

    if (bookNameBool && toReleaseDateBool && fromReleaseDateBool) {
      return books.stream().filter(namePredicate).filter(fromReleaseDatePredicate)
          .filter(toReleaseDatePredicate).findFirst().map(Collections::singletonList)
          .orElseGet(ArrayList::new);
    } else if (bookNameBool && toReleaseDateBool) {
      return books.stream().filter(namePredicate).filter(toReleaseDatePredicate).findFirst()
          .map(Collections::singletonList).orElseGet(ArrayList::new);
    } else if (bookNameBool && fromReleaseDateBool) {
      return books.stream().filter(namePredicate).filter(fromReleaseDatePredicate).findFirst()
          .map(Collections::singletonList).orElseGet(ArrayList::new);
    } else if (toReleaseDateBool && fromReleaseDateBool) {
      return books.stream().filter(fromReleaseDatePredicate).filter(toReleaseDatePredicate)
          .findFirst().map(Collections::singletonList).orElseGet(ArrayList::new);
    } else if (toReleaseDateBool) {
      return books.stream().filter(toReleaseDatePredicate).collect(Collectors.toList());
    } else if (fromReleaseDateBool) {
      return books.stream().filter(fromReleaseDatePredicate).collect(Collectors.toList());
    } else if (bookNameBool) {
      return books.stream().filter(namePredicate).collect(Collectors.toList());
    } else {
      return books;
    }

  }

  @Override
  public Optional<Book> findByUrl(String url) {
    return bookRepository.findById(url);
  }
}
