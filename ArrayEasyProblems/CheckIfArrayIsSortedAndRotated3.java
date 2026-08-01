package ArrayEasyProblems;

public class CheckIfArrayIsSortedAndRotated3 {
    public static boolean check(int[] nums){
        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        if(count==1) return true;
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] nums={2,1,3,4};
        System.out.println(check(nums));
    }
}
