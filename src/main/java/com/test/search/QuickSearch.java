package com.test.search;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSearch implements SearchImpl{

    @Override
    public String search() {
        
        return "This is Quick Search";
    }

    
}
