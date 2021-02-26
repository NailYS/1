package com.example;

public class MyArrayList<T> implements List<T> { //<T> - джинерик, пока не определим какой тип данных будем класть
    private final int initSize = 16; //Инициализировали размер
    private Object[] array; //Объявили массив
    private int pointer = 0;//Номер последнего заполненного элеметна
    private int index = 0;

    public MyArrayList() {
        array = new Object[initSize];
        //Глобально создали пустой массив с размером initSize
    }

    public void add(T t) {
        if (pointer != array.length - 1) {
            System.out.println(array[pointer] = t);
        } else {
            resize();
            System.out.println(array[pointer] = t);
        }
        pointer++;

    }

    public int size() {
        return pointer;
    }

    public boolean contains(T t) {

        for (int i = 0; i < pointer; i++) {
            if (array[i] == t) {
                return true;
            }
        }
        return false;
    }

    public void remove(T t) {
        int x = -1;
        for (int i = 0; i < pointer; i++) {
            if (array[i] == t) {
                x = i;
                break;
            }
        }
        if (x >= 0) {
            for (int i = x; i < pointer; i++) {
                array[i] = array[i + 1];
            }
            array[pointer] = null;
            pointer--;
        }
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    private void resize() {
        Object[] newArray = new Object[array.length * 3 / 2 + 1];
        System.arraycopy(array, 0, newArray, 0, pointer);
    }

}

//  [1][2][null][4][5][6]
