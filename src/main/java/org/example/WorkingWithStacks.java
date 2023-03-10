package org.example;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(3);
        stack.push(43);
        stack.push(54);
        stack.push(7);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.search(7));
    }
}
