package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyTestController {

    public DAO dao = new DAO();
    public List<Book> mybooks = dao.getBooklist();


    @RequestMapping ("/book")
    public List<Book> index(){
        return mybooks;
    }

    @PostMapping("/book/add")
    public String addBook(@RequestBody Book b){
        mybooks.add(b);
        return "book added";
    }

    @PostMapping("book/upsert")
    public String bookUpsert(@RequestBody Book b){
        int indextoupdate = -1;

        for (int i = 0; i < mybooks.size(); i++) {
            if(mybooks.get(i).getId() == b.getId()){
                indextoupdate = i;
            }
        }
        if(indextoupdate == -1){
            mybooks.add(b);
            return "book added";
        }else{
            mybooks.set(indextoupdate,b);
            return "book updateded";
        }

    }

}
