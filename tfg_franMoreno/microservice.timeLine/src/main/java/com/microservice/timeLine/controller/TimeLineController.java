package com.microservice.timeLine.controller;

import com.microservice.timeLine.entities.TimeLine;
import com.microservice.timeLine.service.InterfaceTimeLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/timeline")
public class TimeLineController {

    ////////////////////// INYECCION SERVICIOS ///////////////////////////////////
    @Autowired
    private InterfaceTimeLineService interfaceTimeLineService;

    ////////////////////// PRIMER ENDPOINT ///////////////////////////////////

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveTimeLine(@RequestBody TimeLine timeLine){
        interfaceTimeLineService.save(timeLine);
    }

    ////////////////////// SEGUNDO ENDPOINT: BUSCAR TODOS ///////////////////////////////////

    @GetMapping("/all")
    public ResponseEntity<?> findAllTimeLine(){
        return ResponseEntity.ok(interfaceTimeLineService.findAll());
    }

    ////////////////////// TERCER ENDPOINT: BUSCAR POR ID    ///////////////////////////////////

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(interfaceTimeLineService.findById(id));
}

}
