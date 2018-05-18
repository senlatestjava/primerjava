import java.util.InputMismatchException;
import java.util.Scanner;
import static com.folder.functions.FunctionsJavaTest.checkPrimeNumber;
import static com.folder.functions.FunctionsJavaTest.gcd;
import static com.folder.functions.FunctionsJavaTest.lcm;

public class ResultCalculatingNodNok {

    public static void main(String args[]) {
     try {
         int k;
         int s;
         System.out.println("Ведите первое целое число: ");
         Scanner sc1 = new Scanner(System.in);
         k = sc1.nextInt();
         System.out.println("Ведите второй целое число: ");
         Scanner sc2 = new Scanner(System.in);
         s = sc2.nextInt();

         if ( k%1==0 && s%1==0) {
             System.out.println("Сумма введенных чисел равна: "+(k+s));
             System.out.println("Разность введенных чисел равна: "+(k-s));
             System.out.println("НОД: "+gcd(k,s));
             System.out.println("НОК: "+lcm(k,s));
         } else {
             System.out.println("Введено не целое число!");
         }

     }
     catch (InputMismatchException e) {
         System.out.println("Введено не целое число!");
     }
    }
}
