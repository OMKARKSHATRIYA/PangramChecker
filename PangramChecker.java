
package cloudvandana;

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check for pangram:");
        String input = scanner.nextLine().toLowerCase(); 

        int alphabetCount = 0;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (input.contains(String.valueOf(letter))) {
                alphabetCount++;
            }
        }

        if (alphabetCount == 26) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

