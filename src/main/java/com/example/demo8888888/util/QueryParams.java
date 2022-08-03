package com.example.demo8888888.util;

import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class QueryParams {

  int page;
  int pageSize;
  String bookName;
  LocalDate fromReleaseDate;
  LocalDate toReleaseDate;

}
