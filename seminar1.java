//Получение строк из терминала

// import java.util.Scanner; //Получение строк из терминала
// public class seminar1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//  }
// }

//ввод чисел с терминала

// import java.util.Scanner; 
// public class seminar1 {
//      public static void main(String[] args) {
//      Scanner iScanner = new Scanner(System.in);
//      System.out.printf("int a: ");
//      int x = iScanner.nextInt();
//      System.out.printf("double a: ");
//      double y = iScanner.nextDouble();
//      System.out.printf("%d + %f = %f", x, y, x + y);
//      iScanner.close();
//      }} 

// Проверка на соответствие получаемого типа

// import java.util.Scanner;
// public class seminar1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt(); //Проверка, введено ли именно число
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//  } }

//Проверка на соответствие получаемого типа, плюс решение задачи

// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class seminar1 {
//     public static void main(String[] args) {
//         while (true) { //повторение программы до ошибки
//         live();
// }
// }
// public static void live() {
//     System.out.println("Сколько вам лет?");
//     Scanner scanner = new Scanner(System.in);
//     int age;
//     try {
//     age = scanner.nextInt();
//     if (age < 10) {
//         System.out.println("Вот вам конфетка :) ");
//     } else if (age < 18) {
//         System.out.println("Вот вам книга! ");
//     } else if (age < 70) {
//         System.out.println("Вот вам очки! ");
//     } else {
//         System.out.println("Вы прожили долгую жизнь... ");
//     }
//     } catch (InputMismatchException e) { //Проверка, введено ли именно число 2 вариант try/catch
//     System.out.println("Вы ввели не число,программа закрывается!");
//     System.exit(0);
//     scanner.close();
// }
// }
// }

//создать массив целых чисел и вывести сумму чисел массива

// import java.util.Arrays;

// public class seminar1 {

//     public static void main(String[] args) {
//         int[] arr = {1,3,45,67};        
//         int sum = 0;
//         for (int index = 0; index < arr.length; index++) {
//             sum += arr[index];
//         }
//         arr[2] = 10;
//         System.out.println(sum);
//         System.out.println(Arrays.toString(arr)); //как распечатать массив
//     }

// }

// в фразе развернуть слова

// public class seminar1 {
//     public static void main(String[] args) {
//         String str = "шла саша по шоссе и сосала сушку";
//         System.out.println(str);
//         String[] arr = str.split(" ");
//         StringBuilder sb = new StringBuilder(); //склеивает строку из отдельных слов
//         for (int index = arr.length-1; index >= 0; index--) {
//             String temp = arr[index];
//             sb.append(temp).append(" ");
//         }
//         System.out.println(sb);
//     }

// }

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * seminar1 тестирование
 * Задание 1.
 * В консоли запросить имя пользователя. В зависимости от
 * текущего времени, вывести приветствие вида
 * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
 * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
 * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */
// public class seminar1 {

// public static void main(String[] args) {
// System.out.println("Как вас зовут? " );
// Scanner scan = new Scanner(System.in);
// String s = scan.next();
// LocalDateTime dateTime = LocalDateTime.now();
// int i = dateTime.getHour();
// String temp = "";
// if(i>=5 && i<12){
// temp = "Доброе утро";
// }
// if(i>=12 && i<18){
// temp = "Доброе день";
// }
// if(i>=18 && i<23){
// temp = "Доброе вечер";
// }
// if(i<5 || i>=23){
// temp = "Доброй ночи";
// }
// System.out.println(temp + ", " + s);

// }
// }

// Задание №2
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

// public class seminar1 {
// public static void main(String[] args) {
// int[] arr = { 1, 1, 0, 1, 1, 1};
// int counter = 0;
// int max = 0;
// for (int i : arr) {
// if (i == 1) {
// counter++;
// }
// if (i == 0) {
// if (counter != 0) {
// if (max < counter) {
// max = counter;
// }
// counter = 0;
// }
// }
// }
// if (counter != 0) {
// if (max < counter) {
// max = counter;
// }
// }
// System.out.println(max);
// }

// }

// Задание №3 Реализовать функцию возведения числа а в степень b. a, b из Z.

public class seminar1 {

    public static void main(String[] args) {
        System.out.println("Enter a ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter b ");
        int b = scan.nextInt();

        // int res = 1;
        // for (int index = 1; index <= b; index++) {
        //     res = res * a;
        // }
        // System.out.println("a в степени b = " + res);
//         System.out.println("a в степени b = " + pow(a,b));
//     }
// //Решение рекурсией:
//     public static int pow(int a,int b){
//         if (b==1) {
//             return a;
//         } else {
//             return a * pow(a, b-1);
//         }
//Решение функцией MATH 
System.out.println("a в степени b = " + Math.pow(a,b));
    }
    }
