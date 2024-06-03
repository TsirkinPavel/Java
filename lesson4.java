/*лекция4 Хранение и обработка данных ч1: приоритетные коллекции*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Stack;

public class lesson4 {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
        // pqueue.add(7);
        // pqueue.add(3);
        // pqueue.add(13);
        // pqueue.add(1);
        // pqueue.add(2);
        // pqueue.add(4);
        // pqueue.add(5);
        // System.out.println(pqueue); // [1, 3, 13, 123] все очень странно, но не так
        // System.out.println(pqueue.poll()); // 1
        // System.out.println(pqueue.poll()); // 3
        // System.out.println(pqueue.poll()); // 13
        // System.out.println(pqueue.poll()); // 123
        // System.out.println(pqueue.poll()); // null

        // Deque<Integer> deque = new ArrayDeque<>();
        // deque.addFirst(1);
        // deque.addLast(2);
        // deque.removeFirst();
        // deque.removeLast();
        // deque.offerFirst(1);
        // deque.offerLast(2);
        // deque.pollFirst();
        // deque.pollLast();
        // deque.getFirst();
        // deque.getLast();
        // deque.peekFirst();
        // deque.peekLast();

        var exp = "1 2 3 * +".split(" "); // 1 + 2 x 3
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
               }
            }
        }
        System.out.println(st.pop());
    }
}
