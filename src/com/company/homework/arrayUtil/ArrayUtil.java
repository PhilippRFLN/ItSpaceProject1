package com.company.homework.arrayUtil;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = new int[10];
        array[0] = 6;
        array[1] = 4;
        array[2] = 7;
        array[3] = 18;
        array[4] = 9;
        array[5] = 30;
        array[6] = 16;
        array[7] = 8;
        array[8] = 77;
        array[9] = 22;

        System.out.println("Problem 1");
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Problem 2");

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

        System.out.println("Problem 3");

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);

        System.out.println("Problem 4");

        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
                countEven = countEven + 1;
            }
        }

        System.out.println("Problem 5");

        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
                countOdd = countOdd + 1;
            }
        }

        System.out.println("Problem 6");
        System.out.println(countEven);

        System.out.println("Problem 7");
        System.out.println(countOdd);

        System.out.println("Problem 8");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum/ array.length);

        System.out.println("Problem 9");
        System.out.println(sum);




    }
}
