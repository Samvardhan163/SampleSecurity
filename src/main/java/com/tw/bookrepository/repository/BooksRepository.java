package com.tw.bookrepository.repository;

import com.tw.bookrepository.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Book, Integer>
{
}