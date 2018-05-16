
import com.folder.functions.*;
import java.util.Scanner;

import static com.folder.functions.FunctionsJavaTest.checkPrimeNumber;
import static com.folder.functions.FunctionsJavaTest.dividesByTwo;
import static com.folder.functions.FunctionsJavaTest.isPrimeNumber;

public class ManualEnterData {

    public static void main(String args[]) {
        int k;
        System.out.println("Ведите целое число: ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();


        checkPrimeNumber(k);
        isPrimeNumber(k);
        dividesByTwo(k);

    }




}
