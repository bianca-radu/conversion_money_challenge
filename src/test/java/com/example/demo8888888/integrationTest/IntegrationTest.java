//package com.example.demo8888888.integrationTest;
//
//import static org.junit.Assert.assertTrue;
//
//import com.example.demo8888888.Demo8888888Application;
//import com.example.demo8888888.model.Book;
//import java.time.LocalDate;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Demo8888888Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class IntegrationTest {
//
//  @LocalServerPort
//  private int port;
//
//  TestRestTemplate restTemplate = new TestRestTemplate();
//
//  HttpHeaders headers = new HttpHeaders();
//
//
//  @Test
//  public void calculateCommission() {
//
//    Book book1 = Book.builder().client_id(11).amount(1000F).currency("RON")
//        .date(
//            LocalDate.now()).build();
//
//    HttpEntity<Book> entity = new HttpEntity<Book>(book1, headers);
//
//    ResponseEntity<String> response = restTemplate.exchange(
//        createURLWithPort("/transaction"),
//        HttpMethod.POST, entity, String.class);
//
//    String actual = response.getBody();
//
//    assertTrue(actual.contains("5.0"));
//
//  }
//
//  private String createURLWithPort(String uri) {
//    return "http://localhost:" + port + uri;
//  }
//
//}
