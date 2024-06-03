/*Семинар 4. Хранение и обработка данных ч1: приоритетные коллекции */

/*Задание №4
Реализовать стэк с помощью массива.
Нужно реализовать методы: size(), empty(), push(), peek(), pop().  */

public class seminar4stack {

    private int capacity = 3;
    private int size = 0;
    private int[] array = new int[capacity];
    private int top = -1;

    private void addCapacity() { // Метод увеличения массива в 2 раза
        if (size == capacity) {
            capacity = capacity * 2;
            int[] temp = new int[capacity];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
    }

    public boolean empty() { // определяет пустой стек или нет
        return top == -1;
    }

    public int size() { // определяет количество элементов в стеке
        return size;
    }

    public void push(int value) { // добавляет элемент value в стек
        addCapacity();
        array[++top] = value;
        size++;
    }

    public int peek() { // показывет верхний элемент в стеке
        return array[top];
    }

    public int pop() { // достает верхний элемент из стека удаляя его в стеке
        if (empty()) {
            throw new RuntimeException("stack is empty");
        }
        size--;
        return array[top--]; // покажет top а потом удалит его
    }

    @Override // метод преобразования стека в строку
    public String toString() {
        if (empty())
            return "[]";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            builder.append(array[i]).append(", ");
        }

        builder.delete(builder.length() - 2, builder.length());//удаляет последнюю запятую
        return String.format("[%s]", builder);
    }

}
