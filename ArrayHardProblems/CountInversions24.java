package ArrayHardProblems;

public class CountInversions24 {
    public static int inv(int[] nums){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={5,3,2,4,1};
        System.out.println(inv(nums));
    }
}
