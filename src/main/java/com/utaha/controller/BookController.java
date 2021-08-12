package com.utaha.controller;

import com.utaha.pojo.Books;
import com.utaha.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询所有书籍展示到一个界面上
    @RequestMapping("/all")
    public String queryAllBook(Model model) {
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }

    //跳转到添加界面
    @RequestMapping("/toAdd")
    public String toAddBook() {
        return "addBook";
    }

    //form表单提交 添加书籍
    @RequestMapping("/add")
    public String addBook(Books books) {
        System.out.println("addBook=>>" + books);
        bookService.addBook(books);
        return "redirect:/book/all"; //重定向不能重复提交
    }

    //跳转到修改界面
    @RequestMapping("/toUpdate")
    public String toUpdate(int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("queryBooks", books);
        return "updateBook";
    }

    //form表单提交 修改书籍
    @RequestMapping("/update")
    public String updateBook(Books books) {
        System.out.println("updateBook=>>" + books);
        bookService.updateBook(books);
        return "redirect:/book/all"; //重定向不能重复提交
    }
    //form表单提交 修改书籍
    @RequestMapping("/delete/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBook(id);
        return "redirect:/book/all";
    }
}
