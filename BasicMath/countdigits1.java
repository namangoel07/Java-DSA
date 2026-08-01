package BasicMath;
import java.util.Scanner;

public class countdigits1 {
    public static void Count(int n){
    int count=0;
    while(n>0){
        int temp=n%10;
        count++;
        n=n/10;
    }
    System.out.println("No. of digits are:"+count);
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Digit:");
        int n=in.nextInt();
        Count(n);
        in.close();

    }
}
