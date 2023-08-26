/*WAJP ro check greater between 2 numbers*/

import java.util.Scanner;

public class Check 
{
    public static void main(String[] args) {
        int a , b , big;
        /*Taking Input dynamically */
        Scanner  sc =  new Scanner(System.in);
        System.out.println("Enter 1st Number");
        a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        b=  sc.nextInt();
        if(a>b)
        {
            big=a;
        }
        else
        {
            big=b;
        }
        System.out.println("The number " +big+ " is greater number");
    }
    
}