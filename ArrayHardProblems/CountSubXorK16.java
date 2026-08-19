package ArrayHardProblems;

import java.util.HashMap;
import java.util.Map;

public class CountSubXorK16 {
    public static int countsub(int[] arr,int k){
        int n=arr.length;
        int count=0;
        int xor=0;
        Map<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        for(int i=0;i<n;i++){
            xor^=arr[i];
            int x=xor^k;
            if(mpp.containsKey(x)){
                count+=mpp.get(x);
            }
            mpp.put(xor,mpp.getOrDefault(xor, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={4,2,2,6,4};
        int k=6;
        System.out.println(countsub(arr, k));
    }
}
