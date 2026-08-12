package ArrayHardProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle4 {
    public static List<Integer> pascal(int i){
        ArrayList<Integer> list=new ArrayList<>();
        long ans=1;
        list.add((int)ans);
        for(int col=1;col<i;col++){
            ans=ans*(i-col);
            ans=ans/col;
            list.add((int)ans);
        }
        return list;
    }
    public static ArrayList<ArrayList<Integer>> pascaltrian(int n){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ArrayList<Integer> ansrow=(ArrayList<Integer>) pascal(i);
            ans.add(ansrow);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Integer>> result=pascaltrian(n);
        for(ArrayList<Integer> row:result){
            System.out.println(row);
        }
    }
}
