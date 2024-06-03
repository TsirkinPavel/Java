//Семинар3

/*Задание №0
Даны следующие строки, cравнить их с помощью == и
метода equals() класса Object
 */

// public class seminar3 {
//     public static void main(String[] args) {
//         isEqual(s1, s6);
//     }

//     Object object = new Object();
//     static String s1 = "hello";
//     static String s2 = "hello";
//     static String s3 = s1;
//     static String s4 = "h" + "e" + "l" + "l" + "o";
//     static String s5 = new String("hello");
//     static String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

//     public static void isEqual(String arg0, String arg1) {
//         if (arg0 == arg1) {
//             System.out.println("Равны как ссылки");
//         } else if (arg0 != arg1) {
//             System.out.println("Не равны как ссылки");
//         }
//         if (arg0.equals(arg1)) {
//             System.out.println("Равны как значения");
//         } else if (!arg0.equals(arg1)) {
//             System.out.println("Не равны как значения");
//         }
//     }
// }

/*Задание №1
Заполнить список десятью случайными числами.Отсортировать список методом sort() и вывести его на
экран. */

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Random;

// public class seminar3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> intList = new ArrayList<>();
//         Random random = new Random();
//         for (int i = 0; i < 10; i++) {
//             intList.add(random.nextInt(0,10));
//         }
//         System.out.println(intList);
//         //intList.sort(null);
//         Collections.sort(intList);
//         Collections.sort(intList, Collections.reversOrder()); //от max до min
//         System.out.println(Collections.min(intList));
//         System.out.println(intList);

//     }
// }

/*Задание №3
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа. */

// import java.util.ArrayList;

// public class seminar3 {
//     public static void main(String[] args) {
//         ArrayList str = new ArrayList<String>();
//         str.add("dsgf");
//         str.add(3);
//         str.add(4);
//         str.add("dsgf");
//         str.add(6);
//         str.add("dslhgf");
//         str.add("dshgf");
//         str.add(10);
//         str.add("lhgf");
//         for (int i = 0; i < str.size(); i++) {         

//             if (str.get(i) instanceof Integer) {
//                 str.remove(str.get(i));
//                 i--; //чтобы удалял 2 цифры подряд надо сдвинуть и индекс
//             }
//         }
//         System.out.println(str);
//     }
// }

/*Каталог товаров книжного магазина сохранен в виде двумерного
списка List<ArrayList<String>> так, что на 0й позиции каждого
внутреннего списка содержится название жанра, а на остальных
позициях - названия книг. Напишите метод для заполнения данной
структуры. */

import java.util.ArrayList;
import java.util.List;

public class seminar3 {
    
    public static void main(String[] args) {
        List<ArrayList<String>> books = new ArrayList<>();
        //Три варианта заполнения списков:
        ArrayList<String> proza = new ArrayList<>(List.of("proza", "Война и Мир", "Буратино"));
        
        ArrayList<String> poezia = new ArrayList<>();
        poezia.addAll(List.of("poezia", "Бородино", "Евгений Онегин"));
        
        ArrayList<String> skazki = new ArrayList<>();
        skazki.add("skazki");
        skazki.add("Маша и Медведь");
        skazki.add("Красная шапочка");

        books.addAll(List.of(proza, poezia, skazki));
        System.out.println(books);
    }
}
