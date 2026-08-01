package ArrayEasyProblems;

public class NumberThatAppearsOnce17 {
    public static int number(int[] nums){
        int n=nums.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4};
        System.out.println(number(nums));
    }
}
