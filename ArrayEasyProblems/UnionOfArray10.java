package ArrayEasyProblems;

public class UnionOfArray10 {
    public static void UnionNum(int[] num1,int[] num2){
        int n1=num1.length;
        int n2=num2.length;
        int i=0;
        int j=0;
        int[] union=new int[n1+n2];
        int k=0;
        while(i<n1 && j<n2){
            if(num1[i]<=num2[j]){
               if(k==0 || union[k-1]!=num1[i]){
                union[k]=num1[i];
                k++;
                
               }
               i++;
            }
            else{
                if(k==0|| union[k-1]!=num2[j]){
                    union[k]=num2[k];
                    k++;
                    
                }
                j++;
            }
        }
         while (i < n1) {
            if (k == 0 || union[k - 1] != num1[i]) {
                union[k++] = num1[i];
            }
            i++;
        }
        
        // remaining elements of b
        while (j < n2) {
            if (k == 0 || union[k - 1] != num2[j]) {
                union[k++] = num2[j];
            }
            j++;
        }
        
        for(int l=0;l<union.length;l++){
        System.out.println(union[l]);
        }
    }
    public static void main(String[] args) {
        int[] num1={1,2,3,4,5};
        int[] num2={2,3,4,4,5,6};
        UnionNum(num1, num2);
        
    }
}
