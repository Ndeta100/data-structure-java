package org.example;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
       Map<Integer, Person> map=new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mariam"));
        System.out.println(map);
       map.entrySet().forEach(System.out::println);

       map.forEach((key,person)->{
           System.out.println(key + " " + person);
       });
    }
    record Person(String name){}
}
