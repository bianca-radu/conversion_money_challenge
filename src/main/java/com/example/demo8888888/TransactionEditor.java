//package com.example.demo8888888;
//
//import com.example.demo8888888.model.Book;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import java.beans.PropertyEditorSupport;
//import org.springframework.util.StringUtils;
//
//public class TransactionEditor extends PropertyEditorSupport {
//
//  private ObjectMapper objectMapper;
//
//  public TransactionEditor(ObjectMapper objectMapper) {
//    this.objectMapper = objectMapper;
//  }
//
//  @Override
//  public void setAsText(String text) throws IllegalArgumentException {
//    if (StringUtils.hasText(text)) {
//      setValue(null);
//    } else {
//      Book book = new Book();
//      try {
//        book = objectMapper.readValue(text, Book.class);
//      } catch (JsonProcessingException e) {
//        throw new IllegalArgumentException(e);
//      }
//      setValue(book);
//    }
//  }
//}
//
//
