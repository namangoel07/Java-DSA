package ArrayHardProblems;

import java.util.Arrays;

public class MergeSortedWithoutExtra19 {
    public static void merge(int[] num1,int[] num2){
        int n1=num1.length;
        int n2=num2.length;
        int left=n1-1;
        int right=0;
        while(left>=0 && right<n2){
            if(num1[left]>num2[right]){
                int temp=num1[left];
                num1[left]=num2[right];
                num2[right]=temp;
            }
            else{
                break;
            }
            left--;
            right++;

        }
        Arrays.sort(num1);
        Arrays.sort(num2);
        for(int i=0;i<n1;i++){
          System.out.print(num1[i]+" ");
        }
        for(int i=0;i<n2;i++){
            System.out.print(num2[i]+" ");
        }

        
    }
    public static void main(String[] args) {
        int[] num1={0,4,2,1};
        int[] num2={3,2,5,6};
        merge(num1, num2);
        
    }
}
