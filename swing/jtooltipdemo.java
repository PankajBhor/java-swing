import java.awt.*;
import javax.swing.*;

class JToolTipDemo extends JFrame {
    JToolTipDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout()); // Set the layout manager
        JButton b1 = new JButton("OK");
        b1.setToolTipText("This is ok button");
        c.add(b1); // Add the button without constraints
    }

    public static void main(String args[]) {
        JToolTipDemo f1 = new JToolTipDemo();
        f1.setVisible(true);
        f1.setSize(600, 600);
        f1.setTitle("JToolTip Demo Frame");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}