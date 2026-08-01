package ArrayMediumProblems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement7 {
    public static int maj(int[] nums){
        int n=nums.length;
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> map:mpp.entrySet()){
            if(map.getValue()>(n/2)){
                return map.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[]  nums={2,2,3,3,1,2,2};
        System.out.println(maj(nums));
        
    }
}
