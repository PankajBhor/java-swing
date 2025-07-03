import java.util.*;
class myexception extends Exception{
    myexception(String msg) {
        super(msg);
    }
}
public class mainclass {
    public static void main(String []args) {
        int pass;
        String user;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Username and Password: ");
        user=sc.next();
        pass=sc.nextInt();
        if(pass!=12345) {
            try {
                throw new myexception("Invalid Password");
            }
            catch(myexception me) {
                System.out.println(me);
            }
        }
        else {
            System.out.println("Access Granted");
        }
    }
}
