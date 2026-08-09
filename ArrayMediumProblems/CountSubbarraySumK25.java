package ArrayMediumProblems;

public class CountSubbarraySumK25 {
    public static int countarr(int[] nums,int K){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==K){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1};
        int K=3;
        System.out.println(countarr(nums, K));
    }
}
