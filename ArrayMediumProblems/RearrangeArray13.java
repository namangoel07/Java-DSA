package ArrayMediumProblems;

public class RearrangeArray13 {
    public static void rearrange(int[] nums){
        int n=nums.length;
        int[] pos=new int[n/2];
        int j=0;
        int[] neg=new int[n/2];
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[j]=nums[i];
                j++;
            }
            else{
                neg[k]=nums[i];
                k++;
            }
        }
        int[] ans=new int[n];
        for(int i=0;i<n/2;i++){
            ans[2*i]=pos[i];
            ans[2*i+1]=neg[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums={-1,2,3,-3,4,-2};
        rearrange(nums);
    }
}
