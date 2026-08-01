package ArrayEasyProblems;

public class RotateArrayByOnePlace5 {
    public static void rotateone(int[] nums){
        int first=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i-1]=nums[i];
        }
        nums[n-1]=first;
        for(int j=0;j<n;j++){
            System.out.println(nums[j]);
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        rotateone(nums);
    }
    
}
