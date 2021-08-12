package com.utaha.dao;

import com.utaha.pojo.Books;
import java.util.List;

public interface BookMapper {

    Books queryBookById(int bookID);

    int addBook(Books book);

    int deleteBook(int bookID);

    int updateBook(Books book);

    List<Books> queryAllBook();
}
