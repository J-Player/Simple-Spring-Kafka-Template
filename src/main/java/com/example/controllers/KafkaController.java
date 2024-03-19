package com.example.controllers;

import com.example.producers.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private Producer producer;

    @GetMapping("/{message}")
    public ResponseEntity<String> greeting(@PathVariable("message") String message) {
        producer.sendMessage("Hello %s!".formatted(message));
        return ResponseEntity.ok("Message sent!");
    }

}
