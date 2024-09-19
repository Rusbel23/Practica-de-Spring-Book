package com.demo.appweb.Controller;

import com.demo.appweb.Services.BookService;
import com.demo.appweb.Services.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/books")
public class BookController {
    private final BookServiceImpl bookService;
    public BookController(BookServiceImpl bookServiceImpl){
        this.bookService = bookServiceImpl;
    }
    @GetMapping("/listar")
    @ResponseBody

    public String verContacto() {
        return "hola mundo es bonito";
    }
    @GetMapping("/texto")


    public String formulario(){
        return "formulario";
    }
}
