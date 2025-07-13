import java.awt.*;
import java.awt.event.*;
public class ArithmeticOpDemo extends Frame implements ActionListener {
    TextField tf1,tf2,tf3;
    Button b1,b2,b3,b4;
    ArithmeticOpDemo() {
        tf1=new TextField("Enter First Number",20);
        tf1.select(0,18);
        tf2=new TextField("Enter Second Number",20);
        tf2.select(0,19);
        tf3=new TextField("Result",20);
        b1=new Button("ADD");
        b2=new Button("MUL");
        b3=new Button("SUB");
        b4=new Button("DIV");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand()=="ADD") {
            int c= Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText());
            tf3.setText(c+"");
        }
        else if(ae.getActionCommand()=="SUB") {
            int c= Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText());
            tf3.setText(c+"");
        }
        else if(ae.getActionCommand()=="DIV") {
            int c= Integer.parseInt(tf1.getText())/Integer.parseInt(tf2.getText());
            tf3.setText(c+"");
        }
        else if(ae.getActionCommand()=="MUL") {
            int c= Integer.parseInt(tf1.getText())*Integer.parseInt(tf2.getText());
            tf3.setText(c+"");
        }
    }
    public static void main(String args[]) {
        ArithmeticOpDemo f1=new ArithmeticOpDemo();
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setTitle("Arithmatic operation Frame");
        f1.setLayout(new FlowLayout());
    }
}
