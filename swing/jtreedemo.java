import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
class jtreedemo extends JFrame {
    jtreedemo() {
        Container c=getContentPane();

        DefaultMutableTreeNode lang=new DefaultMutableTreeNode("Lang");

        DefaultMutableTreeNode pop=new DefaultMutableTreeNode("POP");
        DefaultMutableTreeNode p1=new DefaultMutableTreeNode("C");
        DefaultMutableTreeNode p2=new DefaultMutableTreeNode("C#");
        DefaultMutableTreeNode p3=new DefaultMutableTreeNode("FORTRAN");
        pop.add(p1);
        pop.add(p2);
        pop.add(p3);
        lang.add(pop);
        DefaultMutableTreeNode oop=new DefaultMutableTreeNode("OOP");
        DefaultMutableTreeNode o1=new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode o2=new DefaultMutableTreeNode("JAVA");
        DefaultMutableTreeNode o3=new DefaultMutableTreeNode("PYTHON");
        oop.add(o1);
        oop.add(o2);
        oop.add(o3);
        lang.add(oop);
        JTree jt1=new JTree(lang);
        int H=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp1= new JScrollPane(jt1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,H);
        c.add(jsp1,BorderLayout.WEST);
    }
    public static void main(String args[]) {
        jtreedemo f1=new jtreedemo();
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setTitle("jtree demo frame");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
