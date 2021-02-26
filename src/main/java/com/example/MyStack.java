package com.example;

import java.util.Scanner;


public class MyStack {
    static class Stack {
        int value;
        Stack next;
    }


    static int size = 0;
    static Stack last;
    static Stack first;

    static void push(int value) {
        Stack stack = new Stack();
        stack.value = value;
        stack.next = null;
        if (first == null) {
            last = stack;
            first = last;
        } else {
            last.next = stack;
            last = last.next;
        }
        size++;
        System.out.println("ok");
    }

    static void pop() {
        if (size == 0) {
            System.out.println("error");
        } else {
            System.out.println(last.value);
            Stack tempA = first;
            Stack tempB = first;
            while (tempA.next != null) {
                tempB = tempA;
                tempA = tempA.next;
            }
            last = tempB;
            last.next = null;
            size--;
        }
    }

    static void size() {
        System.out.println(size);
    }

    static void clear() {
        first = null;
        last = null;
        size = 0;
        System.out.println("ok");
    }

    static void back() {

        if (size == 0)
            System.out.println("error");
        else
            System.out.println(last.value);

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command;
        command = scan.next();
        while (!command.equals("exit")) {
            switch (command) {
                case "push": {
                    int value = scan.nextInt();
                    push(value);
                    break;
                }
                case "pop": {
                    pop();
                    break;
                }
                case "size": {
                    size();
                    break;
                }
                case "clear": {
                    clear();
                    break;
                }
                case "back": {
                    back();
                    break;
                }
            }
            command = scan.next();
        }
        System.out.println("bye");
    }
}
