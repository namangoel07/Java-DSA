package ArrayMediumProblems;

public class CountSubarraySumK24 {
    public static int count(int[] nums,int K){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                if(sum==K){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1};
        int K=2;
        System.out.println(count(nums, K));

        
    }
}
