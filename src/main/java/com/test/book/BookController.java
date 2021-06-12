package com.test.book;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
    @RequestMapping("/books")
    @ResponseBody
    public List<Book> getAllBooks(){
        List<Book> asList = Arrays.asList(
                    new Book(11,"Sambhaji","Shivaji Sawant"),
                    new Book(101,"Shriman Yogi","Ranjit Desai")
                    );
        return asList;
    }
}
