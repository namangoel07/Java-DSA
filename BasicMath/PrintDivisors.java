package BasicMath;
import java.util.Scanner;

public class PrintDivisors{
    public static void print(int n){
    //   for(int i=1;i<=Math.sqrt(n);i++){
    //     if(n%i==0){
    //         System.out.println(i);
    //         if((n/i)!=i){
    //         System.out.println(n/i);
    //     }
    //     }
        
    //   }
    //------------------------------------
    //instead of Math.sqrt we can also write i*i<=n;
      for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        // Larger divisors in reverse
        for (int i = (int)Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0) {
                if (n / i != i) {
                    System.out.println(n / i);
                }
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter Digit:");
        int n=in.nextInt();
        print(n);
        in.close();
    }
}