package ArrayHardProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum11 {
    public static List<List<Integer>> sum(int[] nums,int target){
        int n=nums.length;
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                            List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(list);
                            st.add(list);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(st);
    }
    public static void main(String[] args) {
        int[] nums={1,0,-1,0,-2,2};
        int target=0;
        for(List<Integer> ans:sum(nums, target)){
            for(int a:ans){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
