package ArrayEasyProblems;

import java.util.HashMap;
import java.util.Map;

public class NumberThatAppearsOnce16 {
    public static int numberonce(int[] nums){
        int n=nums.length;
        // int[] hash=new int[n];
        // for(int i=0;i<n;i++){
        //     hash[nums[i]]++;
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(hash[i]==1){
        //         return i;
        //     }
        // }
        // return -1;
        //-------------------------------
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i], 0)+1);
        }
        for(int num : mpp.keySet()){
        if(mpp.get(num) == 1){
            return num;
        }
    }
    return -1;
        
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4};
        System.out.println(numberonce(nums));
    }
}
