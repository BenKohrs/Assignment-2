package ex34;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        System.out.println("There are " + employees.length + " employees: ");
        for(int i = 0; i<employees.length; i++){
            System.out.println(employees[i]);
        }
        String[] temp = new String[employees.length-1];
        System.out.print("\nEnter an employee name to remove: ");
        String tName = scan.nextLine();
        int tempI = 0;
        for (int i = 0; i < employees.length; i++) {
            if ((tName.equalsIgnoreCase(employees[i])) == false) {
                temp[tempI] = employees[i];
                tempI++;
            }
        }
        System.out.println("There are " + temp.length + " employees: ");
        for(int i = 0; i<temp.length; i++){
            System.out.println(temp[i]);
        }
    }
}
