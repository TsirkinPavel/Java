

// /**
//  * lesson1
//  */
// public class lesson1 {

//     public static void main(String[] args) {
//         int a = 123;
//         //System.out.println(a-- - --a);
//         int[] arr = new int[] {1, 2, 5, 9, 7};     
//         double b = arr[2];         
//         System.out.printf("%d + %f = %f\n", a, b, a + b);
//         String res = String.format("%d - %f = %f\n", a, b, a - b);
//         System.out.println(res);

//         int[] array [] = new int[3] [5]; //делаем пустой двумерный массив 3строки х 5 столбцов
//         for (int[] line: array) {
//             for (int item: line) {
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//Преобразования примитивов
        // int i = 123; double d = i;
        // System.out.println(i); // 123
        // System.out.println(d); // 123.0
        // d = 3.1415; i = (int)d;
        // System.out.println(d); // 3.1415
        // System.out.println(i); // 3
        // d = 3.9415; i = (int)d;
        // System.out.println(d); // 3.9415
        // System.out.println(i); // 3
        // byte b = Byte.parseByte("123");
        // System.out.println(b); // 123
        // b = Byte.parseByte("1234");
        // System.out.println(b); // NumberFormatException: Value out of range  
        

    //     }
    // }

    // Функции

    // public class lesson1 {
    // static void sayHi() {
    //     System.out.println("hi!");
    //     }
    // static int sum(int a, int b) {
    //     return a+b;
    //     }
    // static double factor(int n) {
    //     if(n==1)return 1;
    //     return n * factor(n-1);
    //     }
    // public static void main(String[] args) {
    //     sayHi(); // hi!
    //     System.out.println(sum(1, 3)); // 4
    //     System.out.println(factor(5)); // 120.0
    //     }}
      
    //Условный оператор

    // public class lesson1 {
    //     public static void main(String[] args) {
    //         int a = 1;
    //         int b = 2;
    //         int c;
    //         if (a > b) {
    //             c = a;
    //         } else {
    //             c = b;
    //         }
    //     System.out.println(c);
    //     }
    //    }

    //Тернарный оператор (тоже самое):

    // public class lesson1 {
    //     public static void main(String[] args) {
    //     int a = 1;
    //     int b = 2;
    //     int min = a < b ? a : b; //Если a<b вернется a  иначе b
    //     System.out.println(min);
    //     }
    //    }

    //Оператор выбора
    
    // import java.util.Scanner;
    // public class lesson1 {
    //     public static void main(String[] args) {
    //         Scanner iScanner = new Scanner(System.in);
            
    //         System.out.printf("месяц: ");
    //         String mounth = iScanner.nextLine();
    //         String text = "";
            
    //         switch (mounth) {
    //             case "September":
    //                 text = "Autumn";
    //                 break;
    //             case "August":
    //                 text = "Summer";
    //                 break;
           
    //             default:
    //                 text = "mistake";
    //                 break;
    //         }
    //         System.out.println(text);
    //         iScanner.close();
    //         }         
    // }

    // Циклы 
    //В java доступны следующие циклы:
    // цикл while;
    // цикл do while;
    // цикл for; и его модификация for in

    
    public class lesson1 {
        public static void main(String[] args) {
            int value = 321;
            int count = 0;
            // while (value != 0) {
            //     value /= 10;
            //     count++;
            // }
            //примерно такая же конструкция do while:
            do {
                value /= 10;
                count++;
            } while (value != 0);            
            
            System.out.println(count);

    //Цикл for. Подсчет суммы чисел от 1 до 10
            int s = 0;
            for (int i = 1; i <= 10; i++) {
                s += i;
                }
                System.out.println(s);

    //Вложенные циклы
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%d\t ","(i+1)*j+i+1"); //таблица умножения
                }
                System.out.println();
                }
    //For для коллекций
            int arr[] = new int[10];
            for (int item : arr) {
                System.out.printf("%d ", item);
            }
            System.out.println();
       
    
        }
    
    }