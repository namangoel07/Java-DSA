package ArrayMediumProblems;

public class MajorityElement8 {
    public static int major(int[] nums){
        int el=0;
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                el=nums[i];
            }
            else if(el==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(el==nums[i]){
                count1++;
            }
        }
        if(count1>(n/2)){
            return el;
        }
        return -1;
    }
    public static void main(String[] args) {
        
    
        int[]  nums={2,1,3,3,1,2,2};
        System.out.println(major(nums));
}
}
