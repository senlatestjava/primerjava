package com.folder.functions;

public class FunctionsJavaTest {

    //функция для определения целое/не целое число
    public static boolean checkPrimeNumber(int k) {
         int m=0;
        for (int i=2; i<k; i++) {
            if (k%i==0)
            {
                m++;
            }
        }
        if (m==0)
        {
            System.out.println (k+"-is the prime number ");
            return true;
        }
        else
        {
            System.out.println (k+"-is not prime number ");
            return false;
        }
    }


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

            }
            if (i == 1) {
                System.out.println("Заданное число простое");
            }
        }
        return true;
    }




}
