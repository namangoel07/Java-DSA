package Hashing;
import java.util.Scanner;
public class Practise1 {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter size of array");
      int n=in.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter elements in array");
      for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
      }
      //precompute
      int hash[]=new int[13];
      for(int i=0;i<n;i++){
        hash[arr[i]]+=1;
      }

      System.out.println("Enter query to search");
      int q=in.nextInt();
      //fetch
      System.out.println("Query you are searching is repeating :"+hash[q]+" times");
    }
}
