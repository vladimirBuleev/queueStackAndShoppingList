package Generics;

public class Main {
    public static void main(String[] args) {
        Stack<String>stack=new Stack<>();
        stack.push("v");
        stack.push(new String("hello"));
        stack.push("world");
        stack.push(new String("this is stack"));
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println("//////////////////////////////////////////////////////");
        Queue<Integer>queue = new Queue<>();
        queue.push(3);
        queue.push(4);
        queue.push(32);
        queue.push(72);
        System.out.println(queue.pop());
        System.out.println(queue.pop());


    }

}
