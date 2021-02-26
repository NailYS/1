package com.example;

public class MyLinkedList<T> implements List<T> {

    static class Node<T> {
        T value; //переменная которая будет хранить object
        Node<T> next; //ccылка на следующий элемент
        Node<T> prevous; //ccылка на предыдущий элемент
    }

    Node<T> temp;
    Node<T> start; //самое первое значение
    int size = 0;


    @Override
    public void add(T object) {
        Node<T> node = new Node<>();//Создается новый узел
        node.value = object; //value присваиваем object
        if (start == null)
            start = node;

        else {
            Node<T> temp = start;
            while (temp.next != null) //Пока следующий элемент не будет равняться null
                temp = temp.next;
            temp.next = node;
        }

        size++;
    }

    public void getList() {
        if (start == null)
            return;
        temp = start;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T t) {
        temp = start;
        while (temp != null) {
            if (temp.value == t) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public void remove(T t) {
        if (start == null) {
            return;
        }
        temp = start;
        while (temp.next != null) {
            if (temp.next.value == t) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}