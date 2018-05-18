import java.util.Scanner;
import static com.folder.functions.FunctionsJavaTest.checkPalindrom;

public class PalindromCheck {
    public static void main(String args[]) {
        String str;
        System.out.println("Ведите слово: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

            if (checkPalindrom(str)) {
                System.out.println("Слово палиндромно!");
            }else {
                System.out.println("Слово не палиндромно!");
            }
    }

}
