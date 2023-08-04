import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str="hello",nstr = "";
        char ch;

        System.out.println("Print original word : ");
        System.out.println(str);

        for (int i=0;i<str.length();i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reverse word : "+nstr);
    }
}