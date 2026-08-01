package ArrayEasyProblems;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfArray9 {
    public static void Union(int[] num1,int[] num2){
        int n1=num1.length;
        int n2=num2.length;
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<n1;i++){
            set.add(num1[i]);
        }
        for(int i=0;i<n2;i++){
            set.add(num2[i]);
        }
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args) {
        int[] num1={1,2,3,4,5};
        int[] num2={2,3,4,4,5,6};
        Union(num1, num2);
        //O(n1logn+n2logn)+O(n1+n2)
    }
}
