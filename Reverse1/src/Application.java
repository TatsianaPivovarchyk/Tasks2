/**
 * Created by user on 10/23/2017.
 */
import java.util.Scanner;
import java.util.StringTokenizer;
public class Application {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите предложение: ");
            String str = in.nextLine();

            String reverse = new StringBuffer(str).reverse().toString();
            System.out.println("Предложение в обратном порядке: " + reverse);

            String str1 = str;
            StringTokenizer st = new StringTokenizer(str1, " \t\n\r,.");

            while(st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }
            System.out.println(str1.replace(' ', '*'));

            System.out.println(str1.toUpperCase());

            System.out.println(str1.substring(5,10));
        }

    }

