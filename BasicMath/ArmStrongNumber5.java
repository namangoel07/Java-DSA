package BasicMath;
import java.util.Scanner;

public class ArmStrongNumber5 {
    public static void ArmStrong(int n){
        int original=n;
        int num=0;
        while(n>0){
        int temp=n%10;
        num=num+temp*temp*temp;
        n=n/10;
        }
        if(original==num){
            System.out.println(original+" Number is an Armstrong Number");
        }
        else{
            System.out.println(original+" Number is not an Armstrong number");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter Digit:");
        int n=in.nextInt();
        ArmStrong(n);
        in.close();
        
    }
}
