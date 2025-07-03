import java.awt.*;
import java.awt.event.*;
public class mouselistenerdemo extends Frame implements MouseListener, MouseMotionListener {
    Button b1;
    mouselistenerdemo() {
        b1=new Button("Click Here");
        b1.addMouseListener(this);
        addMouseMotionListener(this);
        add(b1);
    }
    public void mousePressed(MouseEvent me) {
        System.out.println("Mouse Pressed");
    }
    public void mouseClicked(MouseEvent me) {
        System.out.println("Mouse Clicked");

    }
    public void mouseEntered(MouseEvent me) {
        System.out.println("Mouse Entered");

    }
    public void mouseExited(MouseEvent me) {
        System.out.println("Mouse Exited");

    }
    public void mouseReleased(MouseEvent me) {
        System.out.println("Mouse Released");

    }
    public void mouseDragged(MouseEvent me) {
        System.out.println("Mouse Moved");

    }
    public void mouseMoved(MouseEvent me) {
        System.out.println("Mouse Moved");

    }
    public static void main(String args[]) {
        mouselistenerdemo f1=new mouselistenerdemo();
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setTitle("Mouse Event Frame");
        f1.setLayout(new FlowLayout());
    }
}
