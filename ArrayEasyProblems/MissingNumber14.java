package ArrayEasyProblems;

public class MissingNumber14 {
    public static int missing(int[] nums){
        int n=nums.length;
        int totalsum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return totalsum-sum;
    }
    public static void main(String[] args) {
        int[] nums={0,1,2,4};
        System.out.println(missing(nums));
    }
}
