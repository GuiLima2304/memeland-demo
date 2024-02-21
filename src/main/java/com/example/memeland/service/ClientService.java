package com.example.memeland.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("client")
public class ClientService {

    @GetMapping("/")
    public ResponseEntity<String> getAllClients() {
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }


}
