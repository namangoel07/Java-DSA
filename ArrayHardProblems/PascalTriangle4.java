package ArrayHardProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle4 {
    public static List<Integer> pascal(int n){
        ArrayList<Integer> list=new ArrayList<>();
        long ans=1;
        for(int col=1;col<n;col++){
            ans=ans*(n-col);
            ans=ans/col;
            list.add((int)ans);
        }
        return list;
    }
    public static ArrayList<ArrayList<Integer>> pascaltrian(int n){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ArrayList<Integer> ansrow=pascal(i);
            ans.add(ansrow);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        pascal(n);
    }
}
