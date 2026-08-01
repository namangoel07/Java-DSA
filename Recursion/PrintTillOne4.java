package Recursion;

public class PrintTillOne4 {
    public static void PrintOne(int n){
   if(n<1){
    return;
   }
   else{
    System.out.println(n);
    PrintOne(n-1);
   }
    }
    public static void main(String[] args) {
        PrintOne(5);
    }
}
