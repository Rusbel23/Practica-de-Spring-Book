package com.demo.appweb.Services;

import com.demo.appweb.Model.Book;
import com.demo.appweb.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book updateBook(Book book, Long id) {
        return null;
    }

    @Override
    public void deleteBook(Long id) {

    }
}
