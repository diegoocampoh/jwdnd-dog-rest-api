package com.udacity.dogapi.service;

import com.udacity.dogapi.model.Dog;
import com.udacity.dogapi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    public List<Dog> getDogs(){
        return (List<Dog>) dogRepository.findAll();
    }
}
