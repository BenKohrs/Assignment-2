package ex35;
import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        int a = 0;
        int element = 0;
        while (a == 0){
            System.out.print("Enter a name: ");
            String input = scan.nextLine();
            if (input.isEmpty()){
                a++;
            }
            else {
                names.add(input);
            }
        }
        int rngInt = ((int) (Math.random() * (names.size() - 0))) + 0;
        System.out.println("The winner is... " + names.get(rngInt) + ".");
    }
}
