package ArrayMediumProblems;

import java.util.Arrays;

public class LongestConsecutiveSequence18 {
    public static int sequence(int[] nums){
        int n=nums.length;
        int length=1;
        int count=1;
        Arrays.sort(nums);
        int lastelem=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]==lastelem+1){
                lastelem=nums[i];
                count++;
            }
            else if(nums[i]==lastelem){
                continue;
            }
            else{
                count=1;
                lastelem=nums[i];

            }
            length=Math.max(length,count);
        }
        return length;
    }
    public static void main(String[] args) {
        int[] nums={100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        System.out.println(sequence(nums));

    }
}
