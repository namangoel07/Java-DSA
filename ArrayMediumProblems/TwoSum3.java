package ArrayMediumProblems;

import java.util.Arrays;
import java.util.Collection;

public class TwoSum3 {
    public static int[] sum(int[] nums,int target){
        int n=nums.length;
        Arrays.sort(nums);
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                return new int[] {left,right};
            }
            else if(sum<target) left++;
            else right--;
        }
        return new int[] {-1,-1};

    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(sum(nums, target)));
    }
}
