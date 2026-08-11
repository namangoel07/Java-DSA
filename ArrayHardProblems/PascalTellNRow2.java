package ArrayHardProblems;

public class PascalTellNRow2 {
    public static void row(int n){
        for(int c=1;c<=n;c++){
            System.out.println(tell(n-1,c-1));
        }

    }
    public static int tell(int c,int r){
        int rev=1;
        for(int i=0;i<r;i++){
            rev=rev*(c-i);
            rev=rev/(i+1);
        }
        return rev;

    }
    public static void main(String[] args) {
        int n=5;
        row(n);
    }
}
