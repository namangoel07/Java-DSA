package Hashing;
import java.util.Scanner;
public class CharacterHashing2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=in.nextLine();
        int hash[]=new int[26];//for lower case characters only
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        System.out.println("Enter query:");
        char c=in.next().charAt(0);
        System.out.println(hash[c-'a']);
    }
    
}
