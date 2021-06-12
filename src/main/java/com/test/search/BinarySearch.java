package com.test.search;

import org.springframework.stereotype.Component;

@Component
public class BinarySearch implements SearchImpl {

    @Override
    public String search() {
        
        return "This is Binary Search";
    }
    
}
