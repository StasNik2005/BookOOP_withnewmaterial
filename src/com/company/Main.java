package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("J.London", 2019, 500, "White Tooth");
        System.out.println(book);
        Scanner scanner = new Scanner(System.in);
/*        System.out.println("Введите название книжки:");
        book.setTitle();
        book.setAuthor();

        int p;

        do {
            System.out.println("Введите количество страниц:");
            p = -1;
//            scanner.close();
            scanner.reset();
            try {
                String s = scanner.nextLine();
                p = Integer.parseInt(s);
            } catch (Exception exc) {
                System.out.println("Error: " + exc.getLocalizedMessage());
            } finally {
                book.setKolichestvo_stranic(p);
            }
        } while (book.getKolichestvo_stranic() == -1);

        do {
            System.out.println("Введите год издания:");
            p = -1;
            try {
                String s = scanner.nextLine();
                p = Integer.parseInt(s);
            } catch (Exception exc) {
                System.out.println("Error: " + exc.getLocalizedMessage());
            } finally {
                book.setGod_isdania(p);
            }
        } while (book.getGod_isdania() == -1);
        int typeNumber;
        Type arr[] = Type.values();
        for (Type col : arr) {

            System.out.println(col.ordinal() + ") " + col);
        }
        String s = scanner.nextLine();
        typeNumber = Integer.parseInt(s);
        switch (typeNumber) {
            case 0:
                book.setType(Type.Book);
                break;
            case 1:
                book.setType(Type.Magazine);
                break;
            case 2:
                book.setType(Type.Paper);
                break;
            case 3:
                book.setType(Type.E_book);
                break;
            case 4:
                book.setType(Type.site);
                break;
            default:
                System.out.println("Нет такого типа");
                break;
        }
        System.out.println(book);*/
Library library = new Library(5);
library.fill();
        for (Book book1: library.books ) {
            System.out.println(book1);
        }

    }


}


