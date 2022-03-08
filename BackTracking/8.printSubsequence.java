import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printSS(str,"");
    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        for(int i=0;i<str.length();i++){
            printSS(ros,ans+ch);
            printSS(ros,ans);
        }
    }

}