package Recursion;

public class ReverseArray8 {
    public static void Rev(int[] arr,int n){
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        else{
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            reverse(arr, left+1, right-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2};
        int n=arr.length;
        Rev(arr, n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
