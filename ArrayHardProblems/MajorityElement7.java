package ArrayHardProblems;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement7 {
    public static List<Integer> majority(int[] nums){
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        int el1=0;
        int el2 = 0;
        int count1=0;
        int count2=0;
        int min=(n/3)+1;
        for(int i=0;i<n;i++){
            if(count1==0 && el2!=nums[i]){
                count1=1;
                el1=nums[i];
            }
           else if(count2==0 && el1!=nums[i]){
                count2=1;
                el2=nums[i];
            }
            else if(el1==nums[i]){
                count1++;
            }
           else  if(el2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
            
        }
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el1){
                cnt1++;
            }
            else if(nums[i]==el2){
                cnt2++;
            }
        }
        if(cnt1==min){
            list.add(el1);
        }
        if(cnt2==min){
            list.add(el2);
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
