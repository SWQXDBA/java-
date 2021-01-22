package operation;

import booksystem.booklist;

import java.util.Objects;
import java.util.Scanner;

public class searchBook implements IOperation{
    @Override
    public void work(booklist booklist1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入书名");
        String name = scan.next();
     for (int i=0;i<booklist1.booknumber;i++)
     {
         if(Objects.equals(booklist1.books[i].getName(), name))
         {
             System.out.println(booklist1.books[i]);
             return;
         }

     }
        System.out.println("没找到这本书!");
    }
}
