package ex36;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigDecimal;
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<Integer>();
        int inputInt = 0;
        int total = 0;
        boolean stop = false;
        while (stop == false) {
            System.out.println("Enter a number: ");
            String input = scan.nextLine();
            if (input.equals("done")) {
                stop = true;
                break;
            }
            else if (input.matches("[0-9]+") && input.length() > 2) {
                nums.add(Integer.valueOf(input));
            }
        }
        System.out.print("Numbers: ");
        for(int i = 0; i < nums.size(); i++) {
            total += nums.get(i);
            if (i+1 == nums.size()){
                System.out.print(nums.get(i) + "\n");
            }
            else System.out.print(nums.get(i) + ", ");
        }
        System.out.println("The average is " + total/(float)nums.size());
        System.out.println("The minimum is " + Collections.min(nums));
        System.out.println("The maximum is " + Collections.max(nums));
        //System.out.println("The standard deviation is")
    }
}
