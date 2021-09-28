package ex28;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Enter a number: ");
            total += scan.nextInt();
        }
        System.out.println("The total is " + total + ".");
    }
}
