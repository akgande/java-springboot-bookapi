package com.akgande.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.akgande.spring.dao.BookDAO;
import com.akgande.spring.model.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDAO bookDAO;

	@Transactional
	@Override
    public long save(Book book) {
       return bookDAO.save(book);
    }

	@Transactional
    @Override
    public Book get(long id) {
    	return bookDAO.get(id);
    }

    @Transactional
    @Override
    public List<Book> list() {
    	return bookDAO.list();
    }

    @Transactional
    @Override
    public void update(long id, Book book) {
    	bookDAO.update(id, book);
    }

    @Transactional
    @Override
    public void delete(long id) {
    	bookDAO.delete(id);
    }	

}
