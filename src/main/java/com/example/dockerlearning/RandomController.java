package com.example.dockerlearning;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RandomController {
    @GetMapping
    public ResponseEntity<String> print(){
        return ResponseEntity.ok("Docker Tester");
    }
}
