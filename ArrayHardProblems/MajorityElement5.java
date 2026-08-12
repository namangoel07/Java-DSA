package ArrayHardProblems;

import java.util.ArrayList;

public class MajorityElement5 {
    public static ArrayList<Integer> majority(int[] nums){
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(list.size()==0 || (!list.contains(nums[i]))){
                int count=0;
                for(int j=0;j<n;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count>(int)n/3){
                    list.add(nums[i]);
                }

            }
            if(list.size()==2){
                break;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,3,3,2,2,2};
        for(int ans:majority(nums)){
            System.out.println(ans);
        }
    }
}
