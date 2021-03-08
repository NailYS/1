package com.example;

import java.util.Scanner;

public class MyQueue {
    final static int Size = 100;
    static int[] array = new int[Size];
    static int size = 0;
    static int start = 0;
    static int end = 0;

    static void push(int value) {

        if (end > Size - 1) {
            end = 0;
        }
        array[end++] = value;
        System.out.println("ok");
        size++;
    }

    static void clear() {
        start = 0;
        end = 0;
        size = 0;
        System.out.println("ok");

    }

    static void front() {

        if (start > Size - 1) {
            System.out.println(array[0]);
        } else {
            System.out.println(array[start]);
        }

    }

    static void size() {
        System.out.println(size);
    }


    static void pop() {
        if (start > Size - 1)
            start = 0;
        System.out.println(array[start++]);
        size--;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string;
        int value;
        string = scan.next();
        while (!string.equals("exit")) {
            switch (string) {
                case "push": {
                    value = scan.nextInt();
                    push(value);
                    break;
                }
                case "pop": {
                    pop();
                    break;
                }
                case "front": {
                    front();
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


            }
            string = scan.next();
        }
        System.out.println("bye");

    }
}
