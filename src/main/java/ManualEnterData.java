
import com.folder.functions.*;
import java.util.Scanner;

import static com.folder.functions.FunctionsJavaTest.dividesByTwo;
import static com.folder.functions.FunctionsJavaTest.isPrimeNumber;

public class ManualEnterData {

    public static void main(String args[]) {
        int k;
        System.out.println("Ведите целое число: ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();

            if ( k%2 == 0) {
                System.out.println("Введено  целое число");

                } else {

                    System.out.println("Введено не целое число!");
                }


        isPrimeNumber(k);
        dividesByTwo(k);

    }




}
