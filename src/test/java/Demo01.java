import com.utaha.pojo.Books;
import com.utaha.service.BookService;
import com.utaha.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Demo01 {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        List<Books> books = bookServiceImpl.queryAllBook();

        for (Books book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void test02 () {
        if(1>0&&1<0){
            System.out.println("111");
        }
        else
            System.out.println("000");
    }
}
