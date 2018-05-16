package com.folder.functions;

public class FunctionsJavaTest {

    //функция для определения целое/не целое число


    //функция для возврата true на четное и false на нечетное
    public static boolean dividesByTwo(int k)
    {
        if (k%2==0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
        return true;

    }

    //простое или составное число
    public static boolean isPrimeNumber(int k) {
        for (int i=2; i < k; i++) {
            if (k % i == 0 & i != 1) {
                System.out.println("Заданное число - составное");
                return true;
            }
            if (i == 1) {
                System.out.println("Заданное число простое");
            }
        }
        return true;
    }




}
