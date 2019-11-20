package com.company;

import java.util.Date;
import java.util.Dictionary;

public class Library {
    Book [] books;
    public Library(int n) {
        this.books = new Book[n];
    }

    public void fill(){
        for (int c = 0; c < books.length; c++) {
            String title = "book" + c;
            String author = "author" + c;
            int kol_str = (int)(Math.random()*10000);
            int god_izdania = 1564+(int)(Math.random()*455);
           // Type type = ;//(int)(Math.random()*(new Date().getYear()));
            books [c] = new Book(author,god_izdania,kol_str,title);
        }
    }
}
