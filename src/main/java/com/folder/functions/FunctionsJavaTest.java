package com.folder.functions;

public class FunctionsJavaTest {

    public static boolean checkPalindrom(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String inversedString = stringBuilder.reverse().toString();
       return inversedString.equalsIgnoreCase(str);
    }

    //Высчитывание Наибольший общий делитель NOD
    public static int gcd(int k, int s) {
        if (s==0) return k;
        return gcd(s,k%s);
    }

    //Высчитывание Наименьшее общее кратное NOK
    public static int lcm(int k, int s) {
        return k / gcd(k,s) * s;
    }



    //функция для определения целое/не целое число
    public static boolean checkPrimeNumber(int k) {

        if (k%1==0)
        {
            System.out.println ("Число целое ");
            return true;
        }
        else
        {
            System.out.println ("Число не целое число! ");
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
        if (k  == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

}

