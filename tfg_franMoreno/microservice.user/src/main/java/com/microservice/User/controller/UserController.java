package com.microservice.User.controller;
/*CREACION ENDPOINTS*/

import com.microservice.User.Service.InterfaceUserService;
import com.microservice.User.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/user")
public class UserController {

    ////////////////////// INYECCION SERVICIOS ///////////////////////////////////

    @Autowired
    private InterfaceUserService interfaceUserService;

    ////////////////////// PRIMER ENDPOINT ///////////////////////////////////

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody User user){
        interfaceUserService.save(user);
    }

    ////////////////////// SEGUNDO ENDPOINT: BUSCAR TODOS ///////////////////////////////////

    @GetMapping("/all")
    public ResponseEntity<?> findAllUser(){
        return ResponseEntity.ok(interfaceUserService.findAll());
    }

    ////////////////////// TERCER ENDPOINT: BUSCAR POR ID ///////////////////////////////////

    @GetMapping("/search/{id}")// Entre llaves porque sera variable
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(interfaceUserService.findById(id));
    }
}
