
import java.awt.*;
import javax.swing.*;
public class JButtonDemo extends JFrame{
    JButtonDemo() {
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        JButton b1= new JButton("Ok");
        JButton b2= new JButton("Cacel");
        JButton b3= new JButton("Retry");
        c.add(b1);
        c.add(b2);
        c.add(b2);
    }
    public static void main(String args[]) {
        JButtonDemo f1= new JButtonDemo();
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setTitle("jbuttondemo");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
