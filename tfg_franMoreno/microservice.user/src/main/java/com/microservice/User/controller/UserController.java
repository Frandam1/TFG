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

    ////////////////////// CUARTO ENDPOINT: COMUNICACION CON TIMELINE ///////////////////////////////////

    /* este controlador recibe una solicitud para buscar usuarios por su línea de tiempo,
    llama al servicio correspondiente para realizar la búsqueda en la base de datos,
    y luego devuelve los resultados como una respuesta HTTP. */
    @GetMapping("/search-by-timeline/{idTimeLine}")// Entre llaves porque sera variable
    public ResponseEntity<?> findByIdTimeLine(@PathVariable Long idTimeLine){
        return ResponseEntity.ok(interfaceUserService.findByIdTimeLine(idTimeLine));
    }
}
