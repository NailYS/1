package com.example;

import java.util.Scanner;

public class QueueArray {
    static final int initSize = 5;
    static int[] array = new int[initSize];
    static int pointer = 0;
    static int start = 0;
   public static int size = 0;


    static void push(int value) {
        if (pointer > initSize - 1) {
            int[] newArray = new int[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, newArray, 0, pointer);
            array = newArray;
            array[pointer++] = value;
        } else {
            array[pointer] = value;
            pointer++;
        }
        size++;
        System.out.println("ok");
    }

    static void pop() {
        if (size == 0) {
            System.out.println("error");
        } else {
            System.out.println(array[start++]);
            size--;
        }
    }

    static void size() {
        System.out.println(size);
    }

    static long front() {
        if (size == 0)
            System.out.println("error");
        else
            System.out.println(array[start]);
        return 0;
    }

    static void clear() {
        start = 0;
        pointer = 0;
        System.out.println("ok");
        size = 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string;
        string = scan.next();
        while (!string.equals("exit")) {
            switch (string) {
                case "push": {
                    int value = scan.nextInt();
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