package ex33;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your question?");
        String input = scan.nextLine();
        String[] answer = {"Yes", "No", "Maybe", "Ask again later"};
        int rngInt = ((int) (Math.random() * (4 - 0))) + 0;
        System.out.println(answer[rngInt]);
    }
}
