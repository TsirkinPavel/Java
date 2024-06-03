
// Семинар2 

/*Задание №1
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1. */

// import java.util.Scanner;
// import java.util.logging.Logger;

// public class seminar2 {
//     public static void main(String[] args) throws Exception {
//         Scanner scanner = new Scanner(System.in);
//         Logger logger = Logger.getLogger("Main");
//         String c1;
//         String c2;
//         int n;
//         logger.info("введите значение с1: ");
//         c1 = scanner.next();
//         logger.info("введите значение с1: ");
//         c2 = scanner.next();
//         logger.info("введите значение N: ");
//         n = scanner.nextInt();
//         if (n <= 0) {
//             throw new Exception("Не валидное значение N");
//         }
//         for (int i = 0; i < n; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(c1);
//             }
//             if (i % 2 == 0) {
//                 System.out.println(c2);
//             }

//         }
//     }
// }

/*Задание №2
Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
 */

// import java.util.Scanner;
// import java.util.logging.Logger;

// public class seminar2 {
//     public static void main(String[] args) throws Exception {
//         Scanner scanner = new Scanner(System.in);
//         Logger logger = Logger.getLogger("Main");
//         logger.info("введите исходную строку: ");
//         String s = scanner.next();
// if (s.length() == 0) {
//     throw new Exception("Введена пустая строка");
// }
//         char c;
//         StringBuilder sb = new StringBuilder();
//         c = s.charAt(0); // присвоили с значение первого символа строки
//         sb.append(c);
//         for (char item : s.toCharArray()) {
//             if (c != item) {
//                 sb.append(item);
//             }
//             c = item;
//         }
//         logger.info(sb.toString()); //для логгера преобразовываем стрингбилдер в строку
//     }
// }

/* Задание №3
Посчитайте сколько ’’драгоценных камней’’ в куче ’’обычных камней’’
Пример: jewels = “aB”, stones = “aaaAbbbB”   Результат: ”a3B1” */

// import java.util.Scanner;
// import java.util.logging.Logger;

// public class seminar2 {
//     public static void main(String[] args) throws Exception {
//         Scanner scanner = new Scanner(System.in);
//         Logger logger = Logger.getLogger("Main");
//         logger.info("введите значения драгоценностей: ");
//         String jewels = scanner.next();
//         logger.info("введите строку содержащую камни: ");
//         String stones = scanner.next();
//         if (jewels.length() == 0) {
//             throw new Exception("Введена пустая строка драгоценностей");
//         }
//         if (stones.length() == 0) {
//             throw new Exception("Введена пустая строка камней");
//         }
//         int counter = 0;
//         StringBuilder sb = new StringBuilder();
//         for (char c1 : jewels.toCharArray()) {
//             for (char c2 : stones.toCharArray()) {
//                 if (c1 == c2) {
//                     counter++;
//                 }
//             }
//             sb.append(c1)
//                     .append(":")
//                     .append(counter)
//                     .append(" ");
//             counter = 0;
//         }
//         logger.info(sb.toString());
//     }
// }

/*Задание №4
Вам дается строка S и целочисленный массив индексов int index[s.length]. Напишите программу, которая 
перетасует символы в S таким образом, что символ c i-й позиции переместится на индекс index[i] в
результирующей строке. Пример: s = “cba”, index = [3,2,1]    Результат “abc */

//Результат решение не совсем совпадает, надо разобраться
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class seminar2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("введите исходную строку: ");
        String s = scanner.next();
        int[] array = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            logger.info("Введите значение индекса массива: ");
            array[i] = scanner.nextInt();
        }
        char[] result = new char[s.length()];
        for (int i = 0; i < array.length; i++) {
            char temp = s.charAt(i);
            int tempIndex = array[i];
            result[tempIndex - 1] = temp;
        }
        logger.info(Arrays.toString(result)); //Массив в строку для логгера
    }
}

// Задача5. Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим методом в
// файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения
// исключения, оно должно
// записаться в лог-файл.

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.logging.Level;
// import java.util.logging.Logger;

// public class seminar2 {
// private static Logger LOGGER = Log.log(seminar2.class.getName());//Привязали
// Log.java с настройками из log.config

// public static void main(String[] args) {
// LOGGER.log(Level.INFO, "Приложение стартовало");
// String out = "G:\\Learning\\Java";
// writeFileNamesInFile("task1.txt", out);
// }

// private static void writeFileNamesInFile(String in, String out) {
// FileWriter fw = null;
// try {
// fw = new FileWriter(in);
// if (isThrowException()) {
// LOGGER.log(Level.SEVERE, "Возникла ошибка в методе записи: Тут должно быть ее
// подробное описание");
// // throw new RuntimeException("Возникла ошибка в методе записи: Тут должно
// быть
// // ее подробное описание");
// }
// String[] arr = readFileNamesInDir(out);
// for (String s : arr) {
// fw.write(s + "\n");
// }
// } catch (IOException e) {
// throw new RuntimeException(e);
// } finally {
// try {
// fw.close();
// } catch (IOException e) {
// LOGGER.log(Level.SEVERE, e.getMessage(), e);
// throw new RuntimeException("Error closing file", e);
// }
// }
// }

// private static String[] readFileNamesInDir(String path) {
// File file = new File(path);
// if (file.isDirectory()) {
// if (isThrowException()) {
// LOGGER.log(Level.SEVERE, "Возникла ошибка в методе чтения: Тут должно быть ее
// подробное описание");
// // throw new RuntimeException("Возникла ошибка в методе чтения: Тут должно
// быть
// // ее подробное описание");
// }
// File[] files = file.listFiles();
// String[] names = new String[files.length];
// for (int i = 0; i < files.length; i++) {
// names[i] = files[i].getName();
// }
// return names;
// } else {
// throw new RuntimeException("File is not a directory");
// }
// }

// private static boolean isThrowException() { //метод создает случайные ошибки
// для логгера

// int b = 2;
// int digit = (int) (Math.random() * b);
// System.out.println(digit);
// return digit > 0;
// }
// }