//package com.example.demo8888888;
//
//import com.example.demo8888888.model.Book;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DefaultCommissionHandler extends CommissionHandler {
//
//  public static final double MINIMAL_COMMISSION = 0.05;
//  public static final double COMMISSION_PERCENT = 0.5;
//
//  @Override
//  public double getCommission(Book book) {
//    double commission = (COMMISSION_PERCENT * book.getAmount()) / 100;
//    if (commission < MINIMAL_COMMISSION) {
//      return MINIMAL_COMMISSION;
//    }
//    return commission;
//  }
//}
