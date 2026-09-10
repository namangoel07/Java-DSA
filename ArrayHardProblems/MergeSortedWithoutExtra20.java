package ArrayHardProblems;

public class MergeSortedWithoutExtra20 {
    public static void merge(int[] num1,int[] num2){
        int n1=num1.length;
        int n2=num2.length;
        int length=n1+n2;
        int gap=(length/2)+(length%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<length){
                if(left<n1 && right <n1){
                    if(num1[left]>num1[right]){
                        int temp=num1[left];
                        num1[left]=num1[right];
                        num1[right]=temp;
                    }
                }
                else if(left<n1 && right>=n1){
                    if(num1[left]>num2[right-n1]){
                         int temp=num1[left];
                        num1[left]=num2[right-n1];
                        num2[right-n1]=temp;
                    
                    }
                }
                else{
                    if(num2[left-n1]>num2[right-n1]){
                         int temp=num2[left-n1];
                        num2[left-n1]=num2[right-n1];
                        num2[right-n1]=temp;
                    
                    }
                }
                left++;
                right++;
            }
            if(gap==1){
                break;
            }
            gap=(gap/2)+(gap%2);
        }
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
