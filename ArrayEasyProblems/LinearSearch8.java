package ArrayEasyProblems;

public class LinearSearch8 {
    public static int linear(int[] nums,int search){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==search){
                    return i;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
         int[] nums={1,2,3,4,5,6,7,8};
         System.out.println(linear(nums, 0));
         
    }
}
