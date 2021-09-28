package ex29;

import java.util.Scanner;

public class App {
    public static void main (String[] args)
    {
        Scanner scan =new Scanner(System.in);
        String inputVal;
        int inputIntegerVal;
        while(true){
            System.out.print("What is the rate of return? ");
            inputVal = scan.nextLine();
            try {
                inputIntegerVal = Integer.parseInt(inputVal);
            } catch (NumberFormatException e) {
                inputIntegerVal = 0;
            }
            if(inputIntegerVal != 0){
                int ans = (72 / inputIntegerVal);
                System.out.println("It will take "+ ans +" years to double your initial investment.");
                break;
            }
            else
            {
                System.out.println("Sorry. That's not a valid input");
            }
        }
    }
}
