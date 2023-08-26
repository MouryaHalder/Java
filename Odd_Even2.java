//WAJP to check weather a number is Even or Odd taking input Dynamically
import java.util.Scanner;
public class Odd_Even2 
{
    public static void main(String[] args) 
    {
        int n;
        /*Taking Input Dynamically */
        Scanner sc = new Scanner(System.in);  //Scanner is Constructor  & sc is Object
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("The number " +n+ " Is EVEN number");

        }
        else
        {
            System.out.println("The number " +n+ " Is ODD number");
        }
    }
}