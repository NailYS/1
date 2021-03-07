package com.example;

import java.util.Scanner;

public class MyQueue {

    static int maxSize = 100;
    static int[] queArray;
    static int front = 0;
    static int nItems = 0;
    static int rear = 0;

    public MyQueue() {
        queArray = new int[maxSize];
    }


    static void insert(int j) {
        if (rear != maxSize - 1)
            rear = -1;
        System.out.println(queArray[++rear] = j);
        nItems++;
    }


    static long remove() {
        long temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }


    static long peekFront() {
        return queArray[front];
    }

    static boolean isEmpty() {
        return (nItems == 0);
    }

    static boolean isFull() {
        return (nItems == maxSize);
    }


    static int size() {
        return size();
    }

    public static void main(String[] args) {
//        myQueue.insert(3);
//        myQueue.insert(5 );
//        myQueue.insert(8);
        MyQueue myQueue = new MyQueue();
        Scanner scan = new Scanner(System.in);
        String command;
        command = scan.next();
        while (!command.equals("exit")) {
            switch (command) {
                case "push": {
                    int j = scan.nextInt();
                    myQueue.insert(j);
                    break;
                }
                case "pop": {

                    break;
                }
                case "size": {
                    size();
                    break;
                }
                case "clear": {

                }
                case "front": {
                    break;
                }
            }
            command = scan.next();
            for (int i = 0; i < queArray.length; i++) {
                System.out.println(queArray[rear]);
                break;
            }
        }
        System.out.println("bye");

    }
}


