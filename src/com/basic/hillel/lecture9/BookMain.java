package com.basic.hillel.lecture9;

import java.util.Arrays;

/**
 * Created by alpa on 11/14/19
 */
public class BookMain {

    public static void main(String[] args) {
        Author andrzejSapkowski = new Author("Andrzej", "Sapkowski");

        Book witcherLastWish = new Book(1L, "The Witcher: The Last Wish", 1992, andrzejSapkowski);
//        System.out.println(witcherLastWish);

        Book witcherSwordOfDestiny = new Book(2L, "The Witcher: Sword of Destiny", 1993, andrzejSapkowski);
//        System.out.println(witcherSwordOfDestiny);

        Author viktorHugo = new Author("Victor", "Hugo");
        Book hunchbackNotreDame = new Book(3L, "The Hunchback of Notre-Dame", 1831, viktorHugo);
//        System.out.println(hunchbackNotreDame);

        Author stephenKing = new Author("Stephen", "Kingsdfsdfsdf");
        Author stephenKing1 = new Author(null, "King");
        Book theShining = new Book(4L, "The Shining", 1977, stephenKing);
//        System.out.println(theShining);
        System.out.println(stephenKing.equals(stephenKing1));

        Book[] books = {witcherLastWish, witcherSwordOfDestiny, hunchbackNotreDame, theShining};

        for (int i = 0; i < books.length; i++) {
            Author author = books[i].getAuthor();
            if (author.equals(andrzejSapkowski)) {
                System.out.println(author);
            }
        }

        for (Book book : books) {
            Author author = book.getAuthor();
            if (author.equals(andrzejSapkowski)) {
                System.out.println(book);
            }
        }

        for (Book book : books) {
            if (book.getYear() < 1970) {
                System.out.println(book);
            }
        }



//        Arrays.asList(books)
//                .forEach(book -> {
//                    if (book.getAuthor().equals(andrzejSapkowski)) {
//                        System.out.println(book);
//                    }
//                });


    }
}
