import java.util.*;
public class asciidemo {
    public static void main(String args[]) {
        String ch;
        char c;
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the charter whose ASCII value you want to know: ");
        ch=sc.next();
        c=ch.charAt(0);
        a=c;
        System.out.println("ASCII of "+ch+" = "+a);
    }
}
