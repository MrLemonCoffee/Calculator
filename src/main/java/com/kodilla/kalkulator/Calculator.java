package com.kodilla.kalkulator;



public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    double a=10;
    double b=15;
    calculator.addition(a,b);
    calculator.subtraction(a,b);
    }

    public void addition(double a, double b) {
        System.out.println("a+b="+(a+b));

    }
    public void subtraction(double a, double b){
        System.out.println("a-b="+(a-b));
    }
}
