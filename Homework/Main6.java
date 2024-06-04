package Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Homework.*;
import Homework.Phonebook;

public class Main6 {

    public static void main(String[] args) {
        User user1 = new User(1L, "Ivan", "Ivanov", LocalDate.of(2000, 1, 10));
        User user2 = new User(2L, "Pavel", "Sergeev", LocalDate.of(2001, 3, 13));
        User user3 = new User(3L, "Sergey", "Sidorov", LocalDate.of(2002, 5, 15));

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        
        System.out.println(users);
        Phonebook book = new Phonebook(0);
        book.add(user2, 34890560);
        book.add(user2, 34890525);
        book.add(user2, 34890500);
        book.add(user3, 10000000);
        book.add(user3, 10000001);
        book.add(user1, 22222222);

        System.out.println(book.getPhoneBook());
        System.out.println(book.find(user2));
        book.delNum(user2, 34890500);
        book.add(user1, 333333333);
        System.out.println(book.getPhoneBook());

    }
}
