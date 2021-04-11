package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class DAO {

    private List<Book> booklist = new ArrayList<>();

    public DAO(){
        booklist.add(new Book(1,"titel1","author1"));
        booklist.add(new Book(2,"titel2","author2"));
        booklist.add(new Book(3,"titel3","author3"));
        booklist.add(new Book(4,"titel4","author4"));
        booklist.add(new Book(5,"titel5","author5"));
        booklist.add(new Book(6,"titel6","author6"));
    }

    public List<Book> getBooklist(){
        return booklist;
    }
}
