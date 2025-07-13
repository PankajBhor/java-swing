import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ItemEventDemo extends JFrame implements ItemListener {
    JComboBox jcb;
    JTextField tf1;
    ItemEventDemo(){
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
        ItemEventDemo f1=new ItemEventDemo();
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setTitle("Item Event Frame");
        f1.setLayout(new FlowLayout());
    }
}
