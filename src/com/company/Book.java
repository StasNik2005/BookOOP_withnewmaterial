package com.company;


import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Book {
    private String title;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    private Type type;
    private String Author;
    private int God_isdania;
    int kolichestvo_stranic;

    public Book(String author, int god, int kolichestvo, String title) {
        Author = author;
        God_isdania = god;
        this.kolichestvo_stranic = kolichestvo;
        this.title = title;
        this.type = Type.Book;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getGod_isdania() {
        return God_isdania;
    }

    public int getKolichestvo_stranic() {
        return kolichestvo_stranic;
    }

    public void setTitle() {

        Scanner s = new Scanner(System.in);
        this.title = s.nextLine();
    }

    public void setAuthor() {
        Scanner s = new Scanner(System.in);
        String str = "";

        do {
            System.out.println("Введите вашего любимого автора книги:");
            str = s.nextLine();
        } while (!(Character.isUpperCase(str.charAt(0))));

        this.Author = str;
    }

    public void setKolichestvo_stranic(int p) {
        if (p > 0 && p < 10000) {
            this.kolichestvo_stranic = p;
        } else {
            kolichestvo_stranic = -1;
        }
    }

    public void setGod_isdania(int god_isdania) {
        int currentYear = new Date().getYear() + 1900;
        if (currentYear < god_isdania) {
            System.out.println(god_isdania + " год еще не наступил");
            God_isdania = currentYear;
        } else {
            if (god_isdania < 1564) {
                System.out.println("Тогда еще книги не печатались!!!");
                God_isdania = currentYear;
            } else {
                God_isdania = god_isdania;
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", God_isdania=" + God_isdania +
                ", kolichestvo_stranic=" + kolichestvo_stranic +
                ", Type=" + type +
                '}';
    }
}
