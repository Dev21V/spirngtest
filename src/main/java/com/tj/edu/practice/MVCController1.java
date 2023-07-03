package com.tj.edu.practice;

import org.springframework.web.bind.annotation.*;

@RestController
public class MVCController1 {
    @RequestMapping("/test1")
    public String test1 () {
        return "test1";
    }
    @GetMapping("/test2")
    public  String test2(){
        return "test2!!$#@";
    }
    @PostMapping("/post-test1")
    public String postTest1(){
        return """
                {
                    "name" : "이한빈",
                    "birth" : "1998-12-25"
                }
                """;
    }
    @PutMapping("/put-test1")
    public String putTest1(){
        return "put은 업데이트 http Method";
    }

    @DeleteMapping("delete-test1")
    public String delTest1(){
        return "delete ";
    }
}
