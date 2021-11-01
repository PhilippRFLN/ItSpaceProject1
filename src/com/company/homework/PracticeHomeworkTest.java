package com.company.homework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {

        PracticeHomework pH = new PracticeHomework();

        System.out.println(pH.convert(5));
        System.out.println(pH.calcAge(1952));
        System.out.println(pH.nextNumber(15));
        System.out.println(pH.isSameNum(6, 8));
        System.out.println(pH.isSameNum(16, 16));
        System.out.println(pH.lessThanOrEqualToZero(66));
        System.out.println(pH.lessThanOrEqualToZero(-66));
        System.out.println(pH.reverseBool(true));
        System.out.println(pH.reverseBool(false));

        int[] array1=new int[15];
        int[] array2=new int[8];
        System.out.println(pH.maxLength(array1,array2));

    }
}
