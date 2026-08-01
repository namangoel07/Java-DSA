package ArrayEasyProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntersectionArray11 {
    public static void intersection(int[] num1,int[] num2){
        int n1=num1.length;
        int n2=num2.length;
        List<Integer> list=new ArrayList<>();
        int[] visited=new int[n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(num1[i]==num2[j] && visited[j]==0){
                    list.add(num1[i]);
                    visited[j]=1;
                    break;
                }
                if(num2[j]>num1[i]){
                    break;
                }
            }
            
        }
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args) {
        int[] num1={1,2,3,4,5};
        int[] num2={2,3,4,4,5,6};
        intersection(num1, num2);
        
    }
}
