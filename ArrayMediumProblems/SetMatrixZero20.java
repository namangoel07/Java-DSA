package ArrayMediumProblems;

public class SetMatrixZero20 {
    public static void matrix(int[][]nums){
        int n=nums.length;
        int m=nums[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==0){
                    for(int col=0;col<m;col++){
                        if(nums[i][col]!=0){
                            nums[i][col]=-1;
                        }
                    }
                    for(int row=0;row<n;row++){
                        if(nums[row][j]!=0){
                            nums[row][j]=-1;
                        }
                    }

                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==-1){
                    nums[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(nums[i][j]+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] nums={{1,1,1},{1,0,1},{1,1,1}};
        matrix(nums);
         
    }
}
