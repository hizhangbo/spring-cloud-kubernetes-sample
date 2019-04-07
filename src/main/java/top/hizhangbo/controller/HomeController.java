package top.hizhangbo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Bob
 * @Datetime: 2019-04-07 14:14
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity index(){
        return ResponseEntity.ok("hello world");
    }
}
