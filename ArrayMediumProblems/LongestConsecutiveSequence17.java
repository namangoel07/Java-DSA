package ArrayMediumProblems;

import java.util.Arrays;

public class LongestConsecutiveSequence17 {
    public static int longest(int[] nums){
        int n=nums.length;
        Arrays.sort(nums);
        int longest=1;

      for(int i=0;i<n;i++){
        int x=nums[i];
        int count=1;
        while(linear(nums, x+1)){
            x++;
            count++;
        }
        longest=Math.max(longest, count);
      }
      return longest;
    }
    public static boolean linear(int[] nums,int num){
        for(int i=0;i<nums.length;i++){
           if(nums[i]==num){
            return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={102,4,100,1,101,3,2,1,1};
        System.out.println(longest(nums));
    }
}
