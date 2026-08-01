package ArrayMediumProblems;
//kadane's algorithm
public class MaximumSubArraySum11 {
    public static int maxim(int[] nums){
        int n=nums.length;
        int maxsum=nums[0];
        int sum=0;
        int start=0;
        int startar=0;
        int endar=0;
        for(int i=0;i<n;i++){
            if(sum==0){
                start=i;
            }
           sum+=nums[i];
           
         if(sum>maxsum){
            maxsum=sum;
            startar=start;//to print subarray of maxsum
            endar=i;
         }    //agr y last m lgaya loop m toh if array m sirf [-1] hua toh sum update hoke 0 hogya hoga toh maxsum 0 hojayega which is wrong
           if(sum<0){
            sum=0;
           }
        }
        System.out.println(startar+" "+endar);
        return maxsum;
        }
    public static void main(String[] args) {
        
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxim(nums));
       
    }
}
