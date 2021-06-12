package com.test.aop.business;

import com.test.aop.dao.Dao2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
    
    @Autowired
    Dao2 dao2;

    public String getData(){
        return dao2.retrieveData();
    }
}
