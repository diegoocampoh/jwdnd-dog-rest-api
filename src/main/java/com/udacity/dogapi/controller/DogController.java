package com.udacity.dogapi.controller;

import com.udacity.dogapi.model.Dog;
import com.udacity.dogapi.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs(){
        return new ResponseEntity<>(dogService.getDogs(), HttpStatus.OK);
    }
}
