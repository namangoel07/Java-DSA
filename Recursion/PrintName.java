package Recursion;

public class PrintName {
    public static void name(int i,int n){
        if(i>n){
            return;
        }
        else{
            System.out.println("YashRaj");
            name(i+1,n);
        }
    }
    public static void main(String[] args) {
        name(1,3);
    }
    
}
