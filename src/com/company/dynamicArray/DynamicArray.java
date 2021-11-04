package com.company.dynamicArray;

public class DynamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա կանչելլ extend()
    //և ավելացնենք
    public void add(int value) {
        if (!(size < array.length)) {
            extend();
        }
        array[size] = value;
        size++;
    }

    //1․ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․քցել հին մասիվի էլեմենտները նորի մեջ
    //3․հին մսիվի հղումը կապենք նոր մասիվի հղման հետ
    private void extend() {
        int[] array2 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];

        }
        array = array2;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է,
    //վերադարցնել մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել-1
    public int getByIndex(int index) {
        if (index > size) {
            return -1;
        }
        return array[index];
    }

    //սպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }


    }
}
