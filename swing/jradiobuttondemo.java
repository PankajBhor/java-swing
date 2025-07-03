
import javax.swing.*;
import java.awt.*;
public class jradiobuttondemo extends JFrame{
    jradiobuttondemo() {
        Container c=getContentPane();
        ButtonGroup bg1= new ButtonGroup();
        JRadioButton r1= new JRadioButton("Female");
        JRadioButton r2= new JRadioButton("Male");
        JRadioButton r3= new JRadioButton("Rather not say");
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);
        c.add(r1);
        c.add(r2);
        c.add(r3);
    }
    public static void main(String args[]) {
        jradiobuttondemo cb1= new jradiobuttondemo();
        cb1.setVisible(true);
        cb1.setSize(600,600);
        cb1.setTitle("jradiobuttondemo");
        cb1.setLayout(new FlowLayout());
        cb1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}