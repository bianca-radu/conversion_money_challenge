//package com.example.demo8888888;
//
//import com.example.demo8888888.model.Book;
//import com.example.demo8888888.service.BookService;
//import java.io.IOException;
//import org.json.JSONException;
//import org.springframework.stereotype.Component;
//
//@Component
//public class HighTurnoverDiscountHandler extends CommissionHandler {
//
//  public static final double HIGH_TURNOVER_COMMISSION = 0.03;
//  private final BookService bookService;
//
//  public HighTurnoverDiscountHandler(BookService bookService) {
//    this.bookService = bookService;
//  }
//
//  @Override
//  public double getCommission(Book book) {
//    try {
//      if (bookService.checkIfClientHasDiscount(book.getClient_id(), book.getDate())) {
//        return HIGH_TURNOVER_COMMISSION;
//      }
//    } catch (IOException | JSONException e) {
//      e.printStackTrace();
//    }
//    return this.commissionHandler.getCommission(book);
//  }
//}
