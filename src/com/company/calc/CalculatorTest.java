package com.company.calc;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(5, 6));
        System.out.println(calc.substraction(11, 6));
        System.out.println(calc.multiplication(5, 5));
        System.out.println(calc.division(25, 5));

    }
}

