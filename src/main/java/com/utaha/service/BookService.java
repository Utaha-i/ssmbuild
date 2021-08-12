package com.utaha.service;

import com.utaha.pojo.Books;
import java.util.List;

public interface BookService {

    Books queryBookById(int bookID);

    int addBook(Books book);

    int deleteBook(int bookID);

    int updateBook(Books book);

    List<Books> queryAllBook();
}
