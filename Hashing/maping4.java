package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maping4 {

    public static void main(String[] args) {
           Scanner in =new Scanner(System.in);
           int n=in.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
           }
           //pre-compute
           Map<Integer,Integer> mpp=new HashMap<>(); 
           for(int i=0;i<n;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0 )+1);
           }
           int q=in.nextInt();
           System.out.println(mpp.get(q));
    }
}
