package com.example.demo8888888.util;

import com.example.demo8888888.model.Book;
import feign.QueryMap;
import java.util.List;
import java.util.Optional;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "simple-client", url = "https://www.anapioficeandfire.com/api/", fallback = ClientFallback.class)
public interface Client {

  @RequestMapping(method = RequestMethod.GET, value = "/books?{queryParams}")
  List<Book> getBooks(@QueryMap QueryParams queryParams);

  @RequestMapping(method = RequestMethod.GET, value = "/books/{url}")
  Optional<Book> getBook(@PathVariable("url") String url);
}
