package BinarySearchOn1D;

public class LowerBound2 {
    public static int bound(int[] nums,int target){
        int n=nums.length;
        int ans=n;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>=target){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
         int[] nums={1,2,3,4,5,6,7,8,9,10};
        int target=11;
        System.out.println(bound(nums, target));
       
    }
}
