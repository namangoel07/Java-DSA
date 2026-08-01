package Sorting;

public class SelectionSort {
    public static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
            for(int k=0;k<arr.length;k++){
                 System.out.println(arr[k]);
            }
        
    }
    public static void main(String[] args) {
        int[] arr={1,5,1,2,4,8,6,7};
        selection(arr);
    }
    
}
