//package com.example.demo8888888;
//
//import com.example.demo8888888.model.Book;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CommissionChain {
//
//  private final HighTurnoverDiscountHandler highTurnoverDiscountHandler;
//
//  private final ClientDiscountHandler clientDiscountHandler;
//
//  private final DefaultCommissionHandler defaultCommissionHandler;
//
//  public CommissionChain(
//      HighTurnoverDiscountHandler highTurnoverDiscountHandler,
//      ClientDiscountHandler clientDiscountHandler,
//      DefaultCommissionHandler defaultCommissionHandler) {
//    this.highTurnoverDiscountHandler = highTurnoverDiscountHandler;
//    this.clientDiscountHandler = clientDiscountHandler;
//    this.defaultCommissionHandler = defaultCommissionHandler;
//  }
//
//  public CommissionHandler getCommissionHandler() {
//    highTurnoverDiscountHandler.setNextCommissionHandler(clientDiscountHandler);
//    clientDiscountHandler.setNextCommissionHandler(defaultCommissionHandler);
//    return highTurnoverDiscountHandler;
//  }
//
//  public double getCommission(Book book) {
//    return getCommissionHandler().getCommission(book);
//  }
//
//}
