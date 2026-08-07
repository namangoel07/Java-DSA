package ArrayMediumProblems;

public class SetMetrixZero21 {
    public static void setmetrix(int[][] nums){
        int n=nums.length;
        int m=nums[0].length;
        int[] row=new int[n];
        int[] col=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
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
          setmetrix(nums);
      
    }
}
