package BasicMath;

import java.util.Scanner;

public class countDigits2 {
    public static void Count(int n){
        int res=(int)(Math.log10(n)+1);
        System.out.println("Number of digits are:"+res);
    }
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
        System.out.println("Enter Digit:");
        int n=in.nextInt();
        Count(n);
        in.close();

    }
}
