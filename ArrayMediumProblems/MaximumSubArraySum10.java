package ArrayMediumProblems;

public class MaximumSubArraySum10 {
    public static int maxi(int[] nums){
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum>max){
                max=sum;
            }
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxi(nums));
    }
}
