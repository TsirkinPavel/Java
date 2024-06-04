package Homework;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;




public class Phonebook {
    
    public Integer phone;  
    

    public Phonebook( Integer phoneNum) {
        this.phone = phoneNum;        
    } 
    public  HashMap<User, ArrayList<Integer>> phoneBook = new HashMap<>();
    public  ArrayList<Integer> phones = new ArrayList<>();
    
    public int getPhoneLenght(ArrayList<Integer> phones){
        int lenght = phones.size();
        return lenght;
    }
       
    public void add(User name, Integer phoneNum) {   
    
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
    

  public void delNum(User name, Integer phoneNum) {   
    
    if (phoneBook.containsKey(name)) {
          phones = phoneBook.get(name);
          phones.remove(phoneNum);
          
      } 
      else {            
      System.out.println("Такого номера у этого абонента нет");

      }

}  
  

  public ArrayList<Integer> find(User name) {
    
    if (phoneBook.get(name) == null){
      ArrayList<Integer> arr = new ArrayList<>();
      return arr;
    }else{
          return phoneBook.get(name);
    }
    }
   
        public HashMap<User, ArrayList<Integer>> getPhoneBook() {                      
            
                     
    return phoneBook;
        }
        public void printSortMap(){
            Map<String, List<Integer>> map = new HashMap<>();
            map.putAll(map);
            Map<String, List<Integer>> sortedMap = map.entrySet()
        .stream() //открываем байтовый поток
        .sorted(Comparator.comparingInt(entry -> entry.getValue().size())) //вызываем метод сортировки, указываем способ сортировки: //Comparator.comparingInt(entry -> entry.getValue().size()) , причем превращаем байты в инт
        .collect(Collectors.toMap( //собираем из потока мапу
            Map.Entry::getKey, //ключ прежний
            Map.Entry::getValue, // значение прежнее
            (v1, v2) -> v1,
            LinkedHashMap::new // чтобы сохранить порядок сортировки приводим все к линк хэш мэп
        ));
        System.out.println(sortedMap);
        }
    
    
    
        // class CompareLenght implements Comparator<List<String>>{    
    //     public int compare(List<String> a, List<String> b) {
    //         return a.size() - b.size();             
    //       }
    //     }

     }

