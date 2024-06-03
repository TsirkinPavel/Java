// Семинар6: Хранение и обработка данных ч3: множество коллекций Set

/*Задание №0 Задание в методах
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class seminar6 {
    public static void main(String[] args) {
        seminar6 task0 = new seminar6();
        int[] array = task0.initArray();
        System.out.println(Arrays.toString(array));

        System.out.println(task0.getPercentUniqueValues(array));
    }

    /*
     * 1. Напишите метод, который заполнит массив из 100
     * элементов случайными цифрами от 0 до 24.
     */
    public int[] initArray() {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(24);
        }
        return array;
    }

    /*
     * 2. Создайте метод, в который передайте заполненный выше
     * массив и с помощью Set вычислите процент уникальных
     * значений в данном массиве и верните его в виде числа с
     * плавающей запятой.
     * Для вычисления процента используйте формулу:
     * процент уникальных чисел = количество уникальных чисел *
     * 100 / общее количество чисел в массиве.
     */
    public float getPercentUniqueValues(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        System.out.println(set.toString());
        float result = set.size() * (100 / array.length);
        return result;
    }
}
