package ArrayEasyProblems;

public class SecondLargest2 {
    public static int secmax(int[] arr){
      int max=arr[0];
      int secmax=-1;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            secmax=max;
            max=arr[i];
        }
        else if(arr[i]>secmax && arr[i]!=max){
            secmax=arr[i];
        }
      }
      return secmax;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(secmax(arr));
    }
}
