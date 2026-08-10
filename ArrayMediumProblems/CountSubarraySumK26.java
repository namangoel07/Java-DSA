package ArrayMediumProblems;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySumK26 {
    public static int countsub(int [] nums,int K){
        int n=nums.length;
        int count=0;
        Map<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int remove=sum-K;
            if(mpp.containsKey(remove)){
                count+=mpp.get(remove);
            }
            mpp.put(sum,mpp.getOrDefault(sum, 0)+1);

        }
        return count;

    }
    public static void main(String[] args) {
        int[] nums={3,0,3};
        int K=3;
        System.out.println(countsub(nums, K));
        
    }
}
