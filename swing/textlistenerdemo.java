import java.awt.*;
import java.awt.event.*;
public class TextListenerDemo extends Frame implements TextListener {
    TextArea ta1;
    Label l1;
    TextListenerDemo() {
        ta1=new TextArea("Enter Text Here ",30,30);
        ta1.select(0,16);
        l1=new Label("                                                                                                    ");
        ta1.addTextListener(this);
        add(ta1);
        add(l1);
    }
    public void textValueChanged(TextEvent te) {
        String str=ta1.getText();
        l1.setText("Text Value Changed to "+str);
    }
    public static void main(String args[]) {
        TextListenerDemo f1=new TextListenerDemo();
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setTitle("Text Event Frame");
        f1.setLayout(new FlowLayout());
    }
}
