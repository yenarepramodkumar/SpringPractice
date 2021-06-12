package com.test.book;

public class Book {

    private int id;
    private String name;
    private String auther;
   
    public Book(int id, String name, String auther) {
        this.id=id;
        this.name=name;
        this.auther=auther;
    }
       
    public String getAuther() {
        return auther;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuther(String auther) {
        this.auther = auther;
    }
@Override
public String toString() {
    return super.toString();
}
    
}
