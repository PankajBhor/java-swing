import javax.swing.*;
import java.awt.*;
public class jscrollpanedemo extends JFrame{
    jscrollpanedemo() {
        Container c=getContentPane();
        JTextArea ta=new JTextArea("Type Here",20,20);
        int H=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane sp1=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,H);
        c.add(sp1);
    }
    public static void main(String args[]) {
        jscrollpanedemo spd1= new jscrollpanedemo();
        spd1.setSize(300,300);
        spd1.setVisible(true);
        spd1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        spd1.setTitle("JScrollPane Demo");
    }
}
