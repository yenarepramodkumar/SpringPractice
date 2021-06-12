package com.test.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
    
    public String retrieveData(){
        return "This is DAO - 1";
    }
}
