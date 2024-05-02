//Задача1. Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// public class homework1 {
//     public static int countNTriangle(int n){
//         if (n<1){
//             return -1;
//         }
//         int res = (n*(n+1))/2;
//         return res;  
//       }
    
//     public static void main(String[] args) {
//         int n = 0;
//         System.out.println(countNTriangle(n));    
//     }
// }

//Задача2. Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

// public class homework1 {
//     public static void printPrimeNums(int input){
//         boolean b = true;
//     for (int n = 2; n <= input; n++) {
//         for (int i = 2; i < n; i++) {
//             if (n % i == 0) {
//                 b = false;
//                 break;
//             }
//         }
//         if (b) System.out.println(n);
//         else b = true;                  
//     }
// }
//     public static void main(String[] args) {
//        int n = 20;
//        printPrimeNums(n) ;
//     }
// }

//Задача 3. В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

//System.out.println("Некорректный оператор: '" + op + "'");

public class homework1 {
    class Calculator {
        public int calculate(char op, int a, int b) {
          if (op == '+'){
            return a + b;
          }else if (op == '-'){
            return a - b;
          }else if (op == '*'){
            return a * b;
          }else if (op == '/'){
            return a / b;
          } else {
            System.out.println("Некорректный оператор: " + "'" + op + "'");
            return - 1;
            }  
    
        }
    }
    
    public static void main(String[] args) {
      
    }
    
}


