package ArrayMediumProblems;
public class TwoSum1 {
    
    public static void twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i!=j && nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        for(int i=0;i<2;i++){
            System.out.println(ans[i]);
        }
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
    
            twoSum(nums, target);
        
    }
}
