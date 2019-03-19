package com.netcracker;

import com.netcracker.Author;
import com.netcracker.Book;

public class Main {//главный класс был создан просто для проверки
    public static void main(String[] args) {
        Book b = new Book("one",new Author[]{new Author("j.james","e@",'f'),new Author("l.ley","@g.c",'m')},500);
        System.out.println(b.toString());

    }
}
