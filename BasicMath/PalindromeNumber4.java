package BasicMath;
import java.util.Scanner;

public class PalindromeNumber4 {
    public static void Palindrome(int n){
        int original=n;
        int rev=0;
        while(n>0){
            int temp=n%10;
            rev=rev*10+temp;
            n/=10;
        }
        if(original==rev){
            System.out.println(rev+" Number is a palindrome Number");

        }
        else{
            System.out.println(original+" Number is not a palindrome number");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter Digit:");
        int n=in.nextInt();
        Palindrome(n);
        in.close();
        
    }
}
