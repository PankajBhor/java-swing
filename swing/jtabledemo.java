import javax.swing.*;
import java.awt.*;
class jtabledemo extends JFrame {
    jtabledemo() {
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        String data[][]={{"70","Pankaj","India"},
                         {"80","John","USA"},
                         {"90","Amit","UK"},
                         {"95","Srinivas","India"}};
        String column[]={"ID","Name","Country"};
        JTable jt1=new JTable(data,column);
        int H=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp1=new JScrollPane(jt1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,H);
        c.add(jsp1);
        jt1.setToolTipText("This is a table");
    }
    public static void main(String args[]) {
        jtabledemo f1 = new jtabledemo();
        f1.setVisible(true);
        f1.setSize(600, 600);
        f1.setTitle("JToolTip Demo Frame");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}