import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by user on 10/21/2017.
 */
public class Application {

    public static void main(String[] args) {

        String name = "Татьяна Пивоварчик";
        char[] myCharArray = name.toCharArray();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите букву или слово:");
        String str1 = in.nextLine();

        int i;
        for (i = 0; i < myCharArray.length; i++) {

            if (myCharArray[i] == name.charAt(0)) {

                System.out.println("Вы угадали одну букву!");

                //break;
            }

            if (str1.equals(name)) {

                System.out.println("Вы угадали! Поздравляем!");
                //break;
            }

            if (!str1.equals(name)) {

                System.out.println("Вы не угадали, попробуйте еще раз.");

            }
            return;
        }

    }
}





