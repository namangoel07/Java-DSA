package ArrayMediumProblems;

public class RearrangeArray14 {
    public static void rearray(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0)
            {
                ans[pos]=nums[i];
                pos+=2;
            } 
            else
            {
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums={-1,2,3,-3,4,-2};
        rearray(nums);
    }
}
