import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class itemeventdemo extends JFrame implements ItemListener {
    JComboBox jcb;
    JTextField tf1;
    itemeventdemo(){
        Container c=getContentPane();
        jcb=new JComboBox();
        jcb.addItem("India");
        jcb.addItem("USA");
        jcb.addItem("Russia");
        tf1= new JTextField(20);
        jcb.addItemListener(this);
        c.add(jcb);
        c.add(tf1);
    }
    public void itemStateChanged(ItemEvent ie) {
        String str;
        str=(String)jcb.getSelectedItem();
        tf1.setText(str);
    }
    public static void main(String args[]) {
        itemeventdemo f1=new itemeventdemo();
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setTitle("Item Event Frame");
        f1.setLayout(new FlowLayout());
    }
}
