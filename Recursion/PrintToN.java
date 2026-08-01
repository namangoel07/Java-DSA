package Recursion;

public class PrintToN{
    public static void Print(int i,int n){
        if(i>n){
            return;
        }
        else{
            System.out.println(i);
            Print(i+1,n);
        }
    }
    public static void main(String[] args) {
        Print(1,5);
    }
}