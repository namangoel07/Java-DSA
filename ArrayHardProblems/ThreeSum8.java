package ArrayHardProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum8 {
    public static List<List<Integer>> threesum(int[] nums,int target){
        int n=nums.length;
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==target){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(st);
    }
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        int target=0;
        for(List<Integer> triplet: threesum(nums, target)){
            for(int num: triplet) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
