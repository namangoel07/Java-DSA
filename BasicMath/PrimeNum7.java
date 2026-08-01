package BasicMath;

import java.util.Scanner;

public class PrimeNum7 {
    public static void prime(int n){
        int count=0;
        if(n <= 1){
    System.out.println(n + " is not a prime number");
    return;
}
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(n/i !=i){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
        System.out.println("Enter Digit:");
        int n=in.nextInt();
        prime(n);
        in.close();

    }
}
