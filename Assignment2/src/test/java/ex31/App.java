package ex31;
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        int restingHR = 0;
        while (restingHR < 55||restingHR > 95) {
            System.out.print("Resting Pulse: ");
            restingHR = scan.nextInt();
            if (restingHR < 55||restingHR > 95)
                System.out.println("Invalid Input. \n");
        }
        while (age < 1) {
            System.out.print("Age: ");
            age = scan.nextInt();
            if (age < 1)
                System.out.println("Invalid scan. \n");
        }

        System.out.println("Resting Pulse: " + restingHR + "\t\tAge: " + age);
        System.out.println("\nIntensity\t | Rate");
        System.out.println("-------------|--------");
        for (int i = 55; i <= 95; i += 5) {
            double rate = (((220 - age) - restingHR) * (i / 100.0)) + restingHR;
            System.out.println(i + "%" + "\t\t\t | " + Math.round(rate) + " bpm");
        }
    }
}
