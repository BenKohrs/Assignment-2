package ex26;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        int balance, monthlyP;
        double APR;
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your balance? ");
        balance = scan.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        APR = scan.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        monthlyP = scan.nextInt();
        PaymentCalculator formula = new PaymentCalculator();
        int n = formula.monthsNeeded(balance, APR, monthlyP);
        System.out.println("It will take you " + n + " months to pay off this card.");
    }
}
class PaymentCalculator{
    public int monthsNeeded(int bal, double APR, int monthlyP){
        double decimalAPR = APR/100.0;
        double i = decimalAPR/365;
        double b = bal;
        double p = monthlyP;
        double n = (-(1.0/30.0) * ((Math.log(1.0 + b/p * (1.0 - Math.pow((1.0 + i), 30)))) / Math.log(1.0 + i)));
        int roundN = (int) Math.ceil(n);
        return roundN;
    }
}