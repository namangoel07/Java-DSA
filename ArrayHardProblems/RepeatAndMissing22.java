package ArrayHardProblems;

public class RepeatAndMissing22 {
    public static int[] repmis(int[] arr){
        int n=arr.length;
        int[] hash=new int[n+1];
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i<n+1;i++){
            if(hash[i]==2){
                ans[0]=i;
            }
            else if(hash[i]==0){
                ans[1]=i;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={4,3,6,2,1,1};
        int[] ans=repmis(arr);
         for(int i=0;i<2;i++){
        System.out.println(ans[i]);
       }

    }
}
