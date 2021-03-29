package com.udacity.dogapi.repository;

import com.udacity.dogapi.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {

}
