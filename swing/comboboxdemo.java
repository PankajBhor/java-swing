
import java.awt.*;
import javax.swing.*;
public class ComboBoxDemo extends JFrame{
    ComboBoxDemo() {
        Container c=getContentPane();
        JComboBox jcb1= new JComboBox();
        jcb1.addItem("cpp");
        jcb1.addItem("Java");
        jcb1.addItem("Python");
        jcb1.addItem("c");
        jcb1.addItem("PHP");
        c.add(jcb1);
    }
    public static void main(String args[]) {
        ComboBoxDemo cb1= new ComboBoxDemo();
        cb1.setVisible(true);
        cb1.setSize(600,600);
        cb1.setTitle("comboboxdemo");
        cb1.setLayout(new FlowLayout());
        cb1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
