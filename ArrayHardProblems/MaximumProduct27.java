package ArrayHardProblems;

public class MaximumProduct27 {
    public static int maxpro(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int mul=1;
            for(int j=i;j<n;j++){
                mul*=arr[j];
                max=Math.max(mul,max);
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
        System.out.println(maxpro(arr));
    }
}
