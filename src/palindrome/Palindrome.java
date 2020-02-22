/*
 * Author: Lucas Noritomi-Hartwig
 * Date created: February 20, 2020
 * Date last edited: February 21, 2020
 * Program title: Palindrome.java
 * This program directs the user to enter a word then prints the word
 * backwards and then informs the user if it is a palindrome or not.
 */
package palindrome;

import javax.swing.JOptionPane;

public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompting user for input string
        String input = JOptionPane.showInputDialog("Words that are the same "
                + "forwards and backwards are called palindromes.\nThis program"
                + " determines if a word is a palindrome.\n\nEnter a word:");

        // Reversing input string
        String reversed = "";
        for (int j = input.length() - 1; j >= 0; j--) {
            reversed += input.charAt(j);
        }

        // Ignoring lower and uppercase
        String inputLower = input.toLowerCase();
        String reversedLower = reversed.toLowerCase();

        // Outputting whether the input string is palindromic or not
        if (inputLower.equals(reversedLower)) {
            JOptionPane.showMessageDialog(null, input + " in reverse is " + reversed
                    + "\nIt IS a palindrome");
        } else {
            JOptionPane.showMessageDialog(null, input + " in reverse is " + reversed
                    + "\nIt is NOT a palindrome");
        }
    }

}
