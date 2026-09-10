package BinarySearchOn1D;
public class BinarySearch {
    public static int binary(int[] nums,int target){
         int n=nums.length;
         int left=0;
         int right=n-1;
         while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int target=1;
        System.out.println(binary(nums, target));
    }
}
