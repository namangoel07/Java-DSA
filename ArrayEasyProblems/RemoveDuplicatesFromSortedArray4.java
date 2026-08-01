package ArrayEasyProblems;

public class RemoveDuplicatesFromSortedArray4 {
    public static int unique(int[]  nums){
          int i=0;
          int n=nums.length;
          for(int j=0;j<nums.length;j++){
          if(nums[j]!=nums[i]){
            nums[i+1]=nums[j];
            i++;
          }
          }
          return i+1;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,3,4,5,6,7,8,8};
        System.out.println(unique(nums));
    }
}
