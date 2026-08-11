package ArrayHardProblems;

public class PascalTellElem1 {
    public static int tell(int row,int col){
        int n=row-1;
        int r=col-1;
        int rev=1;
        for(int i=0;i<r;i++){
            rev=rev*(n-i);
            rev=rev/(i+1);
        }
        return rev;

    }
    public static void main(String[] args) {
        int row=5;
        int col=3;
        System.out.println(tell(row, col));
        
    }
}
