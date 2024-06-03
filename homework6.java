import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class homework6 {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    private static ArrayList<Integer> phones = new ArrayList<>();
        public void add(String name, Integer phoneNum) {
    
    // Введите свое решение ниже
          if (phoneBook.containsKey(name)) {
                phones = phoneBook.get(name);
                phones.add(phoneNum);
                phoneBook.put(name, phones);
            } else {            
            ArrayList<Integer> temp = new ArrayList<>();    
            phoneBook.put(name, temp);
                phoneBook.get(name);
                temp.add(phoneNum);
    
            }
    
    }
    
        public ArrayList<Integer> find(String name) {
    // Введите свое решение ниже
    if (phoneBook.get(name) == null){
      ArrayList<Integer> arr = new ArrayList<>();
      return arr;
    }else{
          return phoneBook.get(name);
    }
    }
    
        public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
    // Введите свое решение ниже
    return phoneBook;
        }
    }
    // Не удаляйте этот класс - он нужен для 
      
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
                      
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        homework6 myPhoneBook = new homework6();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(homework6.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }

