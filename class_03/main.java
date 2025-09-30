
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        // int num2 = sc.nextInt();
        // if(num1 == num2){
        //     System.out.println("equal");
        // }else if(num1 > num2){
        //          System.out.println("num1 is Grater");
        //     }else{
        //          System.out.println("num2 is Grater");
        //     }

        switch(button){
            case 1 -> System.out.println("hello");
            case 2 -> System.out.println("namaste");
            case 3 -> System.out.println("bonjour");
            default -> System.out.println("invlid Button");
        }
        }
    }