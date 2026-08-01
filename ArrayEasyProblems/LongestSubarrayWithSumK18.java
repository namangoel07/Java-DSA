package ArrayEasyProblems;

public class LongestSubarrayWithSumK18 {
    public static int longestsub(int[] nums,int k){
        int n=nums.length;
        int length=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    length=Math.max(length,j-i+1);
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,1,1,4,2,3};
        int k=3;
        System.out.println(longestsub(nums, k));
    }
}
