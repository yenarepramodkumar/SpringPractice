package com.test.aop.business;

import com.test.aop.dao.Dao1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    Dao1 dao1;

    public String getData(){
        return dao1.retrieveData();
    }
}
