package BasicMath;
import java.util.Scanner;

public class ReverseNumber3 {
    public static void Reverse(int n){
        int rev=0;
        while(n>0){
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        System.out.println("Reverse of Number is:"+rev);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter Digit:");
        int n=in.nextInt();
        Reverse(n);
        in.close();

    }
}
