package ArrayMediumProblems;

public class RotateMatrix23 {
    public static void rotatemat(int[][] nums){
        int n=nums.length;
        //transpose
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
        //reverse each row
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=nums[i][left];
                nums[i][left]=nums[i][right];
                nums[i][right]=temp;
                left++;
                right--;
                
            }
        }
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         int[][] nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         rotatemat(nums);
    }
}
