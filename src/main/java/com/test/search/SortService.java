package com.test.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortService {

    @Autowired
    @Qualifier("quick")
    SearchImpl search;

    public void sort(){
        System.out.println(search.search());
    }
    
}
