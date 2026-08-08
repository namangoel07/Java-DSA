package ArrayMediumProblems;

public class RotateMatrix22 {
    public static void rotate(int[][] nums){
        int n=nums.length;
        int[][] ans=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][n-1-i]=nums[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(nums);
    }
}
