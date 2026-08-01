package ArrayEasyProblems;
import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK19 {
    public static int longest(int[]  nums,int k){
        Map<Integer,Integer> mpp=new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
         if(sum==k)
        {
            maxLen=Math.max(maxLen, i+1);
        }
         int rem=sum-k;
         if(mpp.containsKey(rem)){
            int len=i-mpp.get(rem);
            maxLen=Math.max(maxLen, len);
         }
         if(!mpp.containsKey(sum)){
                mpp.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
         int[] nums={1,2,3,1,1,1,1,4,2,3};
        int k=3;
        System.out.println(longest(nums, k));
    
    }
}
