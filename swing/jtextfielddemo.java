
import java.awt.*;
import javax.swing.*;
public class JTextFieldDemo extends JFrame{
    JTextFieldDemo() {
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        JTextField jt1= new JTextField("Enter Username", 30);
        JPasswordField jt2= new JPasswordField( 30);
        JLabel jl1= new JLabel("Username");
        JLabel jl2= new JLabel("Password");
        JButton  jb1= new JButton("Login");
        jt1.select(0,14);
        c.add(jl1);
        c.add(jt1);
        c.add(jl2);
        c.add(jt2);
        c.add(jb1);
    }
    public static void main(String args[]) {
        JTextFieldDemo f1= new JTextFieldDemo();
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setTitle("JFrame");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
