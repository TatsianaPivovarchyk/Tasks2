import java.util.Scanner;

/**
 * Created by user on 10/22/2017.
 */
public class Application {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ведите номер дня недели: ");
        int x = in.nextInt();

        switch(x){
            case 1: System.out.println("День недели - понедельник");
                break;
            case 2: System.out.println("День недели - вторник");
                break;
            case 3: System.out.println("День недели - среда");
                break;
            case 4: System.out.println("День недели - четверг");
                break;
            case 5: System.out.println("День недели - пятница");
                break;
            case 6: System.out.println("День недели - суббота");
                break;
            case 7: System.out.println("День недели - воскресенье");
                break;
            default :
                System.err.println("Введите корректное значение!");
                break;


        }
    }
}
