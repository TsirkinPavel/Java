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

public class seminar1 {
    public static void main(String[] args) {
        String str = "шла саша по шоссе и сосала сушку";
        System.out.println(str);
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder(); //склеивает строку из отдельных слов
        for (int index = arr.length-1; index >= 0; index--) {
            String temp = arr[index];
            sb.append(temp).append(" ");
        }
        System.out.println(sb);
    }
    
}