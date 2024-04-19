/**
 * @pedrohcdsouza
 * Date: 19/04/2024
 */

import java.util.Scanner;

public class ScannerSystem {
    public static void main(String[] args) {
       System.out.println("Write your name: ");
       Scanner inputScanner = new Scanner(System.in);
       String name = inputScanner.nextLine();
       System.out.println("Your name is: " + name);

    }
}
