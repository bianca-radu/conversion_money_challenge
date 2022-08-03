//package com.example.demo8888888;
//
//import com.example.demo8888888.model.Book;
//import com.google.common.collect.ImmutableList;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ClientDiscountHandler extends CommissionHandler {
//
//  public static final ImmutableList<Integer> DISCOUNT_CLIENT_IDS =
//      ImmutableList.of(42);
//  public static final double CLIENT_COMMISSION = 0.05;
//
//  @Override
//  public double getCommission(Book book) {
//    if (DISCOUNT_CLIENT_IDS.contains(book.getClient_id())) {
//      return CLIENT_COMMISSION;
//    }
//    return this.commissionHandler.getCommission(book);
//  }
//}
