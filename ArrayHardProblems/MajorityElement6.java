package ArrayHardProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement6 {
    public static List<Integer> majority(int[] nums){
        int n=nums.length;
        int min=(n/3)+1;
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
    if(entry.getValue() >= min){
        list.add(entry.getKey());
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
