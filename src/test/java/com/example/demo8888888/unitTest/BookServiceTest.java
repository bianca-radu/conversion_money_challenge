//package com.example.demo8888888.unitTest;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.Mockito.when;
//
//import com.example.demo8888888.model.Book;
//import com.example.demo8888888.repository.TransactionRepository;
//import com.example.demo8888888.service.BookServiceImpl;
//import java.io.IOException;
//import java.time.LocalDate;
//import java.util.Arrays;
//import java.util.Collections;
//import org.json.JSONException;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//@ExtendWith(MockitoExtension.class)
//public class BookServiceTest {
//
//  @Mock
//  TransactionRepository transactionRepository;
//
//  @InjectMocks
//  BookServiceImpl transactionService;
//
//  @Test
//  void testCheckIfClientHasDiscount() throws JSONException, IOException {
//    Book book1 = Book.builder().client_id(1).amount(1000F).currency("RON")
//        .date(
//            LocalDate.now()).build();
//    when(transactionRepository.findAll()).thenReturn(Collections.singletonList(book1));
//    boolean actualResult = transactionService.checkIfClientHasDiscount(1, LocalDate.now());
//    assertFalse(actualResult);
//
//    Book book2 = Book.builder().client_id(1).amount(80F).currency("USD").date(
//        LocalDate.now()).build();
//    Book book3 = Book.builder().client_id(1).amount(30000F).currency("EUR")
//        .date(
//            LocalDate.now()).build();
//    Book book4 = Book.builder().client_id(42).amount(1000F).currency("RON")
//        .date(
//            LocalDate.now()).build();
//    when(transactionRepository.findAll())
//        .thenReturn(Arrays.asList(book1, book2, book3, book4));
//    boolean actualResultMultipleTransactions = transactionService
//        .checkIfClientHasDiscount(1, LocalDate.now());
//    assertTrue(actualResultMultipleTransactions);
//  }
//}
