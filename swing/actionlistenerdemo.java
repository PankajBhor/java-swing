import java.awt.*;
import java.awt.event.*;
public class ActionListenerDemo extends Frame implements ActionListener {
    ActionListenerDemo(String title) {
        super(title);
        setLayout(new FlowLayout());
        setVisible(true);         
        setSize(500, 500);
        Button b1=new Button("Ok");
        b1.addActionListener(this);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Ok Button is pressed");
    }
    public static void main(String args[]) {
        ActionListenerDemo f1 = new ActionListenerDemo("actionlistenerdemo");
    }
}
