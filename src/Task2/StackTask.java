package Task2;

import java.util.Stack;

public class StackTask {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.add("Watermalon");
        stack.add("Grape");
        stack.add("Peach");
        stack.add("Currant");

        System.out.println(stack);

        stack.pop();
        stack.pop();

        System.out.println(stack);
    }
}
