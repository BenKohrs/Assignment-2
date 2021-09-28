package ex24;
import java.util.Scanner;
import java.util.Arrays;

public class App {
    static boolean isAnagram(char[] a, char[] b){
        int lengthA = a.length;
        int lengthB = b.length;
        if(lengthA != lengthB){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < lengthA; i++){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String a = scan.nextLine();
        System.out.println("Enter the second string: ");
        String b = scan.nextLine();
        char[] aArray = new char[a.length()];
        char[] bArray = new char[b.length()];
        for (int i = 0; i < a.length(); i++){
            aArray[i] = a.charAt(i);
        }
        for (int i = 0; i < b.length(); i++){
            bArray[i] = b.charAt(i);
        }
        if (isAnagram(aArray, bArray)) {
            System.out.println( "\"" + a + "\"" + " and " + "\"" + b + "\"" +  " are anagrams.");
        }
        else {
            System.out.println( "\"" + a + "\"" + " and " + "\"" + b + "\"" +  " are not anagrams.");
        }
    }
}

