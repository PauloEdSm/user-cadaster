package br.pauloDev.user_cadaster.controller.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping ("greeting")
    public String greeting () {
        return "Hello user";
    }
}
