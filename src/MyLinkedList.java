import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<T> implements List<T> {

    public class Node<T> {
        T value; //переменная которая будет хранить object
        Node<T> next; //ccылка на следующий элемент
        Node<T> prevous; //ccылка на предыдущий элемент
        Node<T> first;
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
        System.out.println();
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

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList();
        myLinkedList.add("1");
        myLinkedList.add("w");
        myLinkedList.add("4");
        myLinkedList.add("w");
        myLinkedList.add("8");
        myLinkedList.getList();
        System.out.println(myLinkedList.contains("w"));
        System.out.println(myLinkedList.size());
        myLinkedList.remove("4");
        myLinkedList.getList();
    }
}