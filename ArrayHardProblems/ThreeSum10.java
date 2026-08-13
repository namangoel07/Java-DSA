package ArrayHardProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum10 {
    public static List<List<Integer>> sum(int[] nums){
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        for(List<Integer> ans:sum(nums)){
            for(int a:ans){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    
}
