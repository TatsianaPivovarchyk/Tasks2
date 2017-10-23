import java.util.Scanner;

/**
 * Created by user on 10/23/2017.
 */
public class Application {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите размер стороны ромба: ");
            int x = in.nextInt(); //сторона ромба
            int Size = x * 2 -1; //размер двумерного массива

            boolean[][] romb = new boolean[Size][Size];
            int i, j;
            for (i = 0; i<romb.length; i++){
                for(j = 0; j<romb.length; j++) {
                    if (j == Size / 2 - i || j == (Size / 2 + i)) {
                        romb[i][j] = true;
                    } else if (j == i - Size / 2 || j == Size + Size / 2 - i - 1) {
                        romb[i][j] = true;
                    }
                }
            }
             print(romb);
        }

        public static void print(boolean[][] arr){

            for (boolean[] y : arr) {
                for (int j = 0; j < arr.length; j++) {
                    if (y[j]) {
                        System.out.print("*");
                    } else {
                        System.out.printf(" ");
                            }
                        }
                        System.out.println("");
                    }
                }
            }



