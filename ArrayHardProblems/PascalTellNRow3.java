package ArrayHardProblems;

public class PascalTellNRow3 {
    public static void nrow(int n){
        int ans=1;
        System.out.println(ans);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.println(ans+" ");
        }
        
    }
    public static void main(String[] args) {
        int n=5;
        nrow(n);

    }
}
