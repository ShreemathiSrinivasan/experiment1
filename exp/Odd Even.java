/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odd.even;
import java.util.Scanner;
   public class OddEven {
        
    public static void main(String[] args) {
        int i;
        int a[]=new int[5];
        Scanner obj =new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("TO FIND THE NUMBER IS ODD OR EVEN");
        for(i=0;i<5;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println("THE NUMBER "+a[i]+" IS EVEN");
            }
            else
                System.out.println("THE NUMBER "+a[i]+" IS ODD");
    }
        
    }
    
}
