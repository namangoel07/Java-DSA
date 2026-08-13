package ArrayHardProblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class FourSum12 {
    public static List<List<Integer>> sum(int[] nums,int target){
        int n=nums.length;
        Set<List<Integer>> list=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){ 
            HashSet<Integer> set=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long fourth=(long) target-(nums[i]+nums[j]+nums[k]);
                    if(set.contains((int)fourth)){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                        Collections.sort(temp);
                        list.add(temp);
                    }
                    set.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(list);
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
