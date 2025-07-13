
import java.awt.*;
import javax.swing.*;
public class JLabelDemo extends JFrame {
    JLabelDemo() {
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon i1= new ImageIcon("pankaj.png");
        JLabel l1= new JLabel("prachi",i1,JLabel.RIGHT);
        c.add(l1);
    }
    public static void main(String args[]) {
        JProgressBarDemo f1= new JProgressBarDemo();
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setTitle("jlabel demo");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}