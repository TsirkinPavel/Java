public class seminar4main {
    public static void main(String[] args) {
        seminar4stack stack = new seminar4stack();
        System.out.println(stack);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(5);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
