import javax.swing.*;
import java.awt.*;
class jpaneldemo1 extends JPanel {
    jpaneldemo1() {
        JButton b1= new JButton("OK");
        JButton b2= new JButton("CANCEL");
        JButton b3= new JButton("RETRY");        
        add(b1);
        add(b2);
        add(b3);
    }
}
class jpaneldemo2 extends JPanel {
    jpaneldemo2() {
        JCheckBox c1= new JCheckBox("C");
        JCheckBox c2= new JCheckBox("C++");
        JCheckBox c3= new JCheckBox("JAVA");        
        add(c1);
        add(c2);
        add(c3);
    }
}
class jpaneldemo3 extends JPanel {
    jpaneldemo3() {
        JComboBox jb1=new JComboBox();
        jb1.addItem("India");
        jb1.addItem("USA");
        jb1.addItem("UK");
        add(jb1);
    }
}
class jtabbedpanedemo extends JFrame { 
    jtabbedpanedemo() { 
        Container c= getContentPane();
        JTabbedPane jtp= new JTabbedPane();

        jpaneldemo1 pd1=new jpaneldemo1();
        jpaneldemo2 pd2=new jpaneldemo2();  
        jpaneldemo3 pd3=new jpaneldemo3();

        jtp.addTab("Tab1",pd1);
        jtp.addTab("Tab2",pd2);
        jtp.addTab("Tab3",pd3);

        c.add(jtp);
    }
    public static void main(String args[]) {
        jtabbedpanedemo jtpd= new jtabbedpanedemo();
        jtpd.setSize(400,400);
        jtpd.setVisible(true);
        jtpd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtpd.setTitle("JTabbedPane Demo");
    }
}
