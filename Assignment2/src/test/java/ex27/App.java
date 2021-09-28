package ex27;
import java.util.Scanner;
import java.util.regex.Pattern;
public class App {
    static String outputText = "";

    public static void main(String[] args) {
        String firstName, lastName, employeeID, zipCode;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        firstName = scan.nextLine();
        System.out.print("Enter the last name: ");
        lastName = scan.nextLine();
        System.out.print("Enter the ZIP code: ");
        zipCode = scan.nextLine();
        System.out.print("Enter the employee ID: ");
        employeeID = scan.nextLine();
        validateInput(firstName,lastName,zipCode,employeeID);
    }
    public static void validateInput(String firstName, String lastName, String zipCode, String employeeID) {
        boolean firstName1 = validateFirstName(firstName);
        boolean lastName1 = validateLastName(lastName);
        boolean employeeID1 = validateEmployeeID(employeeID);
        boolean zipCode1 = validateZipCode(zipCode);
        if (firstName1 && lastName1 && zipCode1 && employeeID1) {
            outputText = "There were no errors found.";
        }
        System.out.println(outputText);
    }
    public static boolean validateFirstName(String firstName) {
        boolean validated = false;
        if (firstName.length() >= 2) {
            validated = true;
        }
        else {
            outputText += "The first name must be at least 2 characters long.\n";
        }
        return validated;
    }
    public static boolean validateLastName(String lastName){
        boolean validated = true;
        if (lastName.length() < 2) {
            validated = false;
            outputText += "The last name must be at least 2 characters long\n";
        }
        if (lastName.length() == 0) {
            outputText += "The last name must be filled in.\n";
        }
        return validated;
    }
    public static boolean validateZipCode(String zipCode){
        boolean validated = true;
        int intValue;
        try {
            intValue = Integer.parseInt(zipCode);
            if (zipCode.length() != 5){
                outputText += "The zipcode must be a 5 digit number.\n";
                validated = false;
            }
        } catch (NumberFormatException e) {
            outputText += "The zipcode must be a 5 digit number.\n";
            validated = false;
        }
        return validated;
    }
    public static boolean validateEmployeeID(String ID) {
        boolean validated = true;
        String x = "[a-zA-Z]{2}[-][0-9]{4}";
        if ((Pattern.matches(x,ID)) == false){
            outputText += "The employee ID must be in the format of AA-1234.\n";
            validated = false;
        }
        return validated;
    }
}
