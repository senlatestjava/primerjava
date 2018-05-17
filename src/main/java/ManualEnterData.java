import java.util.Scanner;

import static com.folder.functions.FunctionsJavaTest.checkPrimeNumber;
import static com.folder.functions.FunctionsJavaTest.dividesByTwo;
import static com.folder.functions.FunctionsJavaTest.isPrimeNumber;

public class ManualEnterData {

    public static void main(String args[]) {
        try {
            int k;
            System.out.println("Ведите целое число: ");
            Scanner sc = new Scanner(System.in);
            k = sc.nextInt();

            dividesByTwo(k);
            checkPrimeNumber(k);

                if (isPrimeNumber(k)) {
                    System.out.println("Число простое");
                } else {
                    System.out.println("Число составное");
                }
        } catch (Exception InputMismatchException) {
            System.out.println("Введено не целое число!");
        }
    }

}
