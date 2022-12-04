package com.factory.vehicle.controller;

import com.factory.vehicle.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.factory.vehicle.exception.NotFoundException;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/api/restful/v1/car", produces = "application/json")
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/hello")
    public ResponseEntity<?> hello(){
        return new ResponseEntity<>( "hello", OK);
    }

    @GetMapping("/production")
    public ResponseEntity<?> getType(@RequestParam(required = true) String type){
        return new ResponseEntity<>( carService.checkProduction(type), OK);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNotFoundExection(NotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(), NOT_FOUND);
    }
}
