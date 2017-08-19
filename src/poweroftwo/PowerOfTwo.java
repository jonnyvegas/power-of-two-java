/**
 * Chapter 3 #2
 * Project 2
 * PowerOfTwo.java
 * COMP 182
 * October 8, 2014
 * Prof. Putnam
 * This program uses recursion to calculate how much
 * you would be paid if you took a job that
 * used the power of two in cents to pay you.
 * @author Jonathan Villegas
 */
package poweroftwo;

import java.util.Scanner;

/**
 * Calculates the power of two using recursion.
 * @author Jonny
 */
public class PowerOfTwo
{
    //Calculates the power of two and returns using recursion
    public static int calculatePower(int n)
    {
        if(n == 1)//base case
            return 1;
        else
            return 2 * calculatePower(n - 1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Please enter a number of days less than 31: ");
        Scanner in = new Scanner(System.in);
        int theNum = in.nextInt();
        int theResult = calculatePower(theNum);
        if(theNum == 1)
        {
            System.out.println("If you work for 1 day you will get: $" 
                + theResult * .01);
        }
        else
        {
            System.out.println("If you work for " + theNum + " days you will get: $" 
                    + theResult * .01);
        }
    }
}
