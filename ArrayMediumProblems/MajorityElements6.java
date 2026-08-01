package ArrayMediumProblems;

public class MajorityElements6 {
    public static int majority(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>(n/2)){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]  nums={2,2,3,3,1,2,2};
        System.out.println(majority(nums));
        
    }
}
