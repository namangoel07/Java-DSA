package BinarySearchOn1D;

public class SearchInsertPoition3 {
    public static int insert(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
               low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
          int[] nums={1,2,3,4,5,6,7,8,9,10};
        int target=11;
        System.out.println(insert(nums, target));
       
    }
}
