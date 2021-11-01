package com.company.homework;

public class PracticeHomework {
    public long convert(int minutes) {
        return minutes * 60;
    }

    public int calcAge(int years) {
        return 2021 - years;
    }

    public int nextNumber(int number) {
        return number++;
    }

    public boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }

    public boolean lessThanOrEqualToZero(int number) {
        if (number <= 0){
            return true;
        }
            return false;
    }
    public boolean reverseBool(boolean value){
        if(value==true){
            return false;
        }
        return true;
    }
    int maxLength(int[]array1, int[] array2){
        if(array1.length > array2.length){
            return array1.length;
        }
        return array2.length;
    }
}

