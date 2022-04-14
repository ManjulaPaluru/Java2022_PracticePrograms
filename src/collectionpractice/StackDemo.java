package collectionpractice;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(3);
        s.push(4);
        s.push(5);
        s.add(6);
        s.add(7);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.peek());
        System.out.println(s.search(3));
    }
}
