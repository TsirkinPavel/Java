package Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



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
        book.add(user2, 66666666);
        book.add(user3, 10000000);        
        book.add(user1, 22222222);

        System.out.println(book.getPhoneBook());
        System.out.println(book.find(user2));
        book.delNum(user2, 34890500);
        book.add(user3, 333333333);

        System.out.println(book.getPhoneBook());
        
        Map<String, List<Integer>> map = new HashMap<>();
        map.put(user1.toString(), book.find(user1));
        map.put(user2.toString(), book.find(user2));
        map.put(user3.toString(), book.find(user3));
        Map<String, List<Integer>> sortedMap = map.entrySet()
        .stream() 
        .sorted(Comparator.comparingInt(entry -> entry.getValue().size()))         
        .collect(Collectors.toMap( 
            Map.Entry::getKey, 
            Map.Entry::getValue, 
            (v1, v2) -> v1,
            LinkedHashMap::new 
        ));
        
        System.out.println(sortedMap);

    }
}
