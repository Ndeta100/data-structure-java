package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      String[] colors=new String[5];
      colors[0]="White";
      colors[2]="Blue";

        System.out.println(Arrays.toString(colors ));
        System.out.println(colors[0]);
        int[] number={100,45};
        for (int i = 0; i <colors.length ; i++) {
            System.out.println(colors[i]);
        }
        for (int i = colors.length-1; i >0 ; i--) {
            System.out.println(colors[i]);
        }
        for(String color: colors){
            System.out.println(color);
        }
        Arrays.stream(colors).forEach(System.out::println);
        System.out.println();
        System.out.println();
        System.out.println("Dynamic arrays");
        //Dynamic array
        DynamicArray dynamicArray =new DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.insert(0,"X");
        dynamicArray.delete("A");
      System.out.println(dynamicArray.search("B"));
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
        System.out.println(dynamicArray.capacity);

    }
}