package ArrayEasyProblems;

public class MoveZeroesToEnd7 {
    public static void move(int[] nums){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                if(i!=j){
                    nums[i]=nums[j];
                    nums[j]=0;
                }
                i++;
            }
        }
        
    }
    public static void main(String[] args) {
        int[] nums={0,0,1,2};
        move(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
