import java.awt.*;
import java.awt.event.*;
public class keyeventdemo extends Frame implements KeyListener{
    TextField tf1;
    Label l1,l2,l3;
    keyeventdemo() {
        tf1=new TextField(50);
        l1=new Label("                      ");
        l2=new Label("                      ");
        l3=new Label("                          ");

        tf1.addKeyListener(this);
        add(tf1);
        add(l1);
        add(l2);
        add(l3);
    }
    public void keyPressed(KeyEvent ke) {
        char ch=ke.getKeyChar();
        l1.setText("Key Pressed: "+ch);
    }
    public void keyTyped(KeyEvent ke) {
        char ch=ke.getKeyChar();
        l2.setText("Key Typed: "+ch);
    }
    public void keyReleased(KeyEvent ke) {
        char ch=ke.getKeyChar();
        l3.setText("Key Released: "+ch);
    }
    public static void main(String args[]) {
        keyeventdemo f1=new keyeventdemo();
        f1.setSize(600,600);
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setLayout(new FlowLayout());
        f1.setTitle("Key Event Frame");
    }
}
