package com.demo.appweb.Services;

import com.demo.appweb.Model.Book;

import java.util.List;

public interface BookService {
    Book addBook(Book book);
    List<Book> getAll();
    Book updateBook(Book book,Long id);
    void deleteBook(Long id);
}
