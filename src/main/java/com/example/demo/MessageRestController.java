package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class MessageRestController {

      @Value("${course.message}")
      private String message;
      @GetMapping("/message")
      public String helloWord() {
        return message;
      }
//    @GetMapping(path = "/api/v1/message")
//    public ResponseEntity<String> getMessage1() {
//        return ResponseEntity.ok("Hello world!");   }



    /*@Value(("${course.message.default-value-if-not-exist}"))
            private String message;*/

}


