package ArrayMediumProblems;

public class MaximumSubArraySum9 {
    public static int maxsum(int[] nums){
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                  sum+=nums[k];
                }
                if(sum>maxsum){
                    maxsum=sum;
                }
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxsum(nums));
        
    }
}
