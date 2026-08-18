package ArrayHardProblems;

import java.util.HashMap;

public class SubArrayWithSumZero14 {
    public static int LongestSubarray(int[] nums){
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum==0){
                max=i+1;
            }
            else{
                if(mpp.get(sum)!=null){
                    max=Math.max(max,i-mpp.get(sum));
                }
                else{
                    mpp.put(sum,i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={1,-1,3,2,-2,-8,1,7,10,23};
        System.out.println(LongestSubarray(nums));
    }
}
