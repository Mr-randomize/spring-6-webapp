package com.iviberberi.spring6webapp.service;

import com.iviberberi.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
