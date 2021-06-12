package com.test.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person,Integer> {

    
    
}
