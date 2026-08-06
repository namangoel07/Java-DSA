package ArrayMediumProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray16{
    public static List<Integer> leader(int[] nums){
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>max){
               
                list.add(nums[i]);
                
            }
             max=Math.max(max,nums[i]);
        }
        Collections.reverse(list);
        
        return list;
    }
    public static void main(String[] args) {
        int[] nums={10,22,12,3,0,6};
        System.out.println(leader(nums));
    }
}