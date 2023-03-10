package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
     Map<Person, Diamond>map=new HashMap<>();
     map.put(new Person("Ndeta"),new Diamond("Africa"));
        System.out.println(map.get(new Person("Ndeta")));






    }
    public static void maps(){
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
    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    record  Diamond(String origin){}
}
