package Recursion;

public class PrintNTimes1 {
    public static void fun(int count){
        
        if(count==4){
            return;
        }
        else{
            System.out.println(count);
            
            fun(count+1);
        }
    }
    public static void main(String[] args){
        fun(1);
    }
}
