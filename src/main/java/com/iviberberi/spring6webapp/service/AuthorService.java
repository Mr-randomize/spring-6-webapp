package com.iviberberi.spring6webapp.service;

import com.iviberberi.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
