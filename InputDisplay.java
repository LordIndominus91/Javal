package com.company;
/*This code ask a user to input a string (a sequence of letters, numbers and alphanumeric characters)
then asks them to input the number of times they would like their message to be displayed, then displays it x times
 */
import java.util.*;
public class InputDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a line of text you would like to be displayed: ");
        String input = in.nextLine();
        System.out.println("Please input the number of times you would like the message to be displayed: ");
        String input2 = in.nextLine();
        int display = Integer.parseInt(input2);

        for (int x = 0; x < display; x++) {
            System.out.println(input);
        }
    }

}