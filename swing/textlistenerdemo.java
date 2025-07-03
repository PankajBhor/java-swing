import java.awt.event.*;
import java.awt.*;
public class textlistenerdemo extends Frame implements TextListener {
    TextArea ta1;
    Label l1;
    textlistenerdemo() {
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
        textlistenerdemo f1=new textlistenerdemo();
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setTitle("Text Event Frame");
        f1.setLayout(new FlowLayout());
    }
}
