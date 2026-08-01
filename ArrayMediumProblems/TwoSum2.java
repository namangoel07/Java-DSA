package ArrayMediumProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public static int[] twosumapp(int[] nums,int target){
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int req=target-a;
            if(mpp.containsKey(req)){
                return new int[] {mpp.get(req),i};
            }
            mpp.put(a,i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twosumapp(nums, target)));
    
    }
}
