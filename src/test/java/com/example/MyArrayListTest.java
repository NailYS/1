package com.example;


import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {

    @Test
    public void add() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        Assert.assertEquals(1, myArrayList.size());
    }

    @Test
    public void add1() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        Assert.assertEquals(false, myArrayList.isEmpty());
    }


    @Test
    public void size() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        Assert.assertEquals(2, myArrayList.size());
    }

    @Test
    public void contains() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        Assert.assertEquals(true, myArrayList.contains(10));
    }

    @Test
    public void remove() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.remove(20);
        Assert.assertEquals(1, myArrayList.size());
    }

    @Test
    public void remove1() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.remove(10);
        Assert.assertNotEquals(false, myArrayList.isEmpty());
    }

    @Test
    public void isEmpty() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        Assert.assertNotEquals(0, myArrayList.size());
    }
}