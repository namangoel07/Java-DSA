package ArrayHardProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum9 {
    public static List<List<Integer>> major(int[] nums){
        int n=nums.length;
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> list=Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(list);
                    st.add(list);

                }
                set.add(nums[j]);
            }
           
        }
        return new ArrayList<>(st);
    }
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        for(List<Integer> num:major(nums)){
            for(int ans:num){
                System.out.print(ans+" ");
            }
            System.out.println();

        }
    }
    
}
