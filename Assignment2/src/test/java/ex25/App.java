package ex25;
import java.util.Scanner;
import java.util.regex.*;
public class App {
    static int passwordValidator(String pass) {
        String regexD = "\\d+";
        String regexC = "[a-zA-Z]+";
        String regexDC = "^(?=.*?[a-zA-Z])(?=.*?[0-9]).{8,}$";
        String regexDC2 = "^(?=.*?[a-zA-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        if (pass.length() < 8) {
            if (pass.matches(regexD)) {
                return 1;
            } else if (pass.matches(regexC)) {
                return 2;
            }
        }
        Pattern p = Pattern.compile(regexDC);
        Pattern p2 = Pattern.compile(regexDC2);
        Matcher m = p.matcher(pass);
        Matcher m2 = p2.matcher(pass);
        if (m2.find()){
            return 4;
        }
        if (m.find()){
            return 3;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password;
        String strength = "";

        System.out.println("Enter a password:");
        password = scan.nextLine();
        switch (passwordValidator(password)){
            case 1: strength = ("very weak");
            break;
            case 2: strength = ("weak");
            break;
            case 3: strength = ("strong");
            break;
            case 4: strength = ("very strong");
            break;
        }
        System.out.println("The password " + password + " is a " + strength + " password.");
    }
}