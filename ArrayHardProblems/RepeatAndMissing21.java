package ArrayHardProblems;

public class RepeatAndMissing21 {
    public static int[] repmis(int[] arr){
        int n=arr.length;
        int[] ans=new int[2];
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    count++;
                }

            }
            if(count==2){
                ans[0]=i;

            }
            else if(count==0){
                ans[1]=i;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={4,3,6,2,1,1};
       int[] ans= repmis(arr);
       for(int i=0;i<2;i++){
        System.out.println(ans[i]);
       }

    }
}
