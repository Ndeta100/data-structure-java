package org.example;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String [] args) {
     LinkedList<Person> linkedList=new LinkedList<>();
     linkedList.add(new Person("Ndeta",23));
     linkedList.add(new Person("Nani",22));
        ListIterator<Person> personListIterator= linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

    }
    public static void queue(){
        Queue<Person> supermarket=new LinkedList<>();
        supermarket.add(new Person("Ndeta",23));
        supermarket.add(new Person("Inno",3));
        supermarket.add(new Person("Mariam",2));
        supermarket.add(new Person("Rolland",24));
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
    static record Person(String name , int age){}
}
