package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class UnorderedMap5 {
    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
           int n=in.nextInt();
           
           String arr[]=new String[n];
           HashMap<String,Integer> mmp=new HashMap<>();
          
           for(int i=0;i<n;i++)
        {
            arr[i]=in.nextLine();
            mmp.put(arr[i],mmp.getOrDefault(arr[i], 0)+1);
        }
          String q=in.nextLine();
          System.out.println(mmp.get(q));
          
    }

}
