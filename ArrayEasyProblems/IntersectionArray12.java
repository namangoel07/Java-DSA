package ArrayEasyProblems;

public class IntersectionArray12 {
    public static void intersec(int[] num1,int[] num2){
        int n1=num1.length;
        int n2=num2.length;
        int i=0;
        int j=0;
        int[] inter1=new int[n1+n2];
        int k=0;
        while(i<n1 && j<n2){
            if(num1[i]<num2[j]){
                i++;
            }
            else if(num1[i]>num2[j]){
                j++;
            }
            else{
              inter1[k++]=num1[i];
              i++;
              j++;
            }
        }
        for(int l=0;l<k;l++){
            System.out.println(inter1[l]);
        }
    }
    public static void main(String[] args) {
        
 int[] num1={1,2,3,4,5};
        int[] num2={2,3,4,4,5,6};
        intersec(num1, num2);
       
    }
}
