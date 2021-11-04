package com.company.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray array= new DynamicArray();
        array.add(7);
        array.add(77);
        array.add(777);
        array.print();
        System.out.println(array.getByIndex(1));


    }
}
