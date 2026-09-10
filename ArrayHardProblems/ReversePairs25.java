package ArrayHardProblems;

public class ReversePairs25 {
    public static int revpair(int[] nums){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>2*nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={40,25,19,12,9,6,2};
        System.out.println(revpair(nums));
    }
}
