package ArrayMediumProblems;

public class SortColors5 {
    public static void sortcolor(int[] nums){
        int n=nums.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;

            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
            int temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;
            high--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        //DUtch NAtional Flag Algorithm
        int[] nums={0,1,2,0,1,2,1,2,0,0,0,1};
        sortcolor(nums);
    

    }
}
