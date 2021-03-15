package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueArrayTest {

    @Test
    public void push() {
        QueueArray.push(1);
        QueueArray.push(2);
        QueueArray.push(3);
        QueueArray.push(4);
        Assert.assertEquals(4, QueueArray.size);
    }

    @Test
    public void push2() {
        QueueArray.push(1);
        QueueArray.push(2);
        QueueArray.push(3);
        QueueArray.push(4);
        Assert.assertEquals(1, QueueArray.array[0]);
    }

    @Test
    public void pop() {
        QueueArray.push(11);
        QueueArray.push(22);
        QueueArray.push(33);
        QueueArray.push(44);
        QueueArray.pop();
        Assert.assertEquals(22, QueueArray.array[1]);
        QueueArray.pop();
        Assert.assertEquals(33, QueueArray.array[2]);
        Assert.assertEquals(0, QueueArray.array[0]);


    }

    @Test
    public void size() {

    }

    @Test
    public void front() {
        QueueArray.pop();
        Assert.assertEquals(0, QueueArray.front());

    }

    @Test
    public void clear() {

    }

    @Test
    public void main() {
    }
}