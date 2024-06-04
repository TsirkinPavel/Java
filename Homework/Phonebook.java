package Homework;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;




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
            CompareLenght compLenght = new CompareLenght();
            LinkedHashMap<User, ArrayList<Integer>> phoneBookSort = new LinkedHashMap<>();            
            
                     
    return phoneBook;
        }
    class CompareLenght implements Comparator<List<String>>{    
        public int compare(List<String> a, List<String> b) {
            return a.size() - b.size();             
          }
        }
     }

