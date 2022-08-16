/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prime;
import java.util.Scanner;
   public class Prime {
        
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int i,j,n;
        System.out.println("ENTER THE INTEGER");
        n=obj.nextInt();
        for(i=2;i<=n;i++) 
        {
            for(j=2;j<=i;j++)
        { 
                if(i%j==0)
                    break;
        }
           if(i==j)        
            System.out.println("THE PRIME NUMBERS UPTO "+n+" ARE "+j);
        } 
        } 
   }
   
              
    
        
    
   

