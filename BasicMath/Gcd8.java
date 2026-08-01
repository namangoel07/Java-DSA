package BasicMath;

import java.util.Scanner;

public class Gcd8 {
    public static void gcd(int n1,int n2){
        int gcd1=1;
    //  for(int i=1;i<=Math.min(n1,n2);i++){
    //     if(n1%i==0 && n2%i==0){
    //        gcd1=i;
    //     }
    //  }

    for(int i=Math.min(n1,n2);i>=1;i--){
        if(n1%i==0 && n2%i==0){
            gcd1=i;
            break;
        }
    }
     System.out.println("Gcd of these number is:"+gcd1);
    }
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
        System.out.println("Enter First Digit:");
        int n1=in.nextInt();
          System.out.println("Enter Second Digit:");
        int n2=in.nextInt();
        gcd(n1,n2);
        in.close();

    }
    
}
