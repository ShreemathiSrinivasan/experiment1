/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pattern;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);  
    System.out.println("Enter the number of rows needed to print the pattern ");
        int rows = obj.nextInt();
        System.out.println("## Printing the pattern ##");
        for (int i=1; i<=rows; i++) 
        { 
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
