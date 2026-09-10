package ArrayHardProblems;
public class RepeatAndMissing23{
    public static int[] repmis(int[] arr){
        int n=arr.length;
        int[] ans=new int[2];
        //S-SN=X-Y
        //S2-S2N=X^2-Y^2
        long S=(n*(n+1))/2;
        long S2=(n*(n+1)*(2*n+1))/6;
        long SN=0;
        long S2N=0;
        for(int i=0;i<n;i++){
            SN+=arr[i];
            S2N+=(long)arr[i]*arr[i];
            
        }
        long val1=S-SN;
        long val2=S2-S2N;
        val2=val2/val1; //X+Y
        long x=(val1+val2)/2;//x
        long y=val2-x;//y
        ans[0]=(int)x;
        ans[1]=(int)y;
        return ans;

    }
    public static void main(String[] args) {
        int[] arr={4,3,2,6,1,1};
                int[] ans=repmis(arr);
         for(int i=0;i<2;i++){
        System.out.println(ans[i]);
       }

    }

}