package Recursion;

public class PrintUsingSingle5 {
    public static void PrintNum(int n){
     if(n<1){
        return;
     }
     else{
        PrintNum(n-1);
        System.out.println(n);
     }
    }
    public static void main(String[] args) {
        PrintNum(5);
    }
}
