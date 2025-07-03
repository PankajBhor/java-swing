import java.util.*; 
class myexception extends Exception {
    myexception(String s) {
        super(s);
    }
}
public class exceptiondemo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age<18) {
            try {
                throw new myexception("Ag is-");
            }
            catch(myexception e) {
                System.out.println(e);
            }
        }
        else {
            System.out.println("Age is+ ");
        }
    }
}
