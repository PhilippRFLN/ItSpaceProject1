package com.company.homework.arrayUtil;

public class UtilTest {
    public static void main(String[] args) {

        int[] array = new int[9];
        array[0] = 2;
        array[1] = 5;
        array[2] = 8;
        array[3] = 88;
        array[4] = 45;
        array[5] = 7;
        array[6] = 9;
        array[7] = 12;
        array[8] = 3;

        Util util = new Util();
        util.printArray(array);
        System.out.println(util.maxArray(array));
        System.out.println(util.minArray(array));
        System.out.println(util.countEven(array));
        System.out.println(util.countOdd(array));
        System.out.println(util.sum(array));
        System.out.println(util.mijin(array));

    }
}
