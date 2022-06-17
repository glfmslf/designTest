package org.example.prototype;

import org.example.builder.People;

/**
 * @author yuyou
 * @since 2022/6/17 14:50
 */
public class Main {
    public static void main(String[] args) {
        People people = new People.Builder().setAge(1).setGender("male").setName("yy").setSex(1).build();

        Book book = new Book(people);
        Book cloneBook = book.clone();
        System.out.println(book == cloneBook);
        System.out.println(book.getPeople() == cloneBook.getPeople());
        System.out.println(book.getPeople());
        System.out.println(cloneBook.getPeople());
    }
}
