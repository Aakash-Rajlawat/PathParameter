package com.aakash.pathparameter.controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookRestController {

    @GetMapping("/book/{bname}/author/{bauthor}")
    public ResponseEntity<String> getBookAndAuthor(@PathVariable("bname") String bookName, @PathVariable("bauthor") String bookAuthor) {
        String response = bookName +" By : " + bookAuthor + " is out of stock.";
        return ResponseEntity.ok(response);
    }
}
