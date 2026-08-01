package ArrayEasyProblems;

public class RotateArrayByKPlaces6 {
    public static void rotate(int[] nums,int k){
        int n=nums.length;
        k=k%n;
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);
       for(int i=0;i<n;i++){
        System.out.println(nums[i]);
       }

    }
    public static void swap(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums, k);

    }
}
