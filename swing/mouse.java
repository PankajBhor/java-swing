import java.awt.*;
import java.awt.event.*;
public class Mouse extends Frame implements MouseListener {
    Button b1;
    Mouse() {
        b1=new Button("Click Here");
        b1.addMouseListener(this);
        add(b1);
    }
    public void mousePressed(MouseEvent me) {
    }
    public void mouseClicked(MouseEvent me) {
    }
    public void mouseEntered(MouseEvent me) {
        int x = b1.getX(); // Get current X position of the button
        int y = b1.getY(); // Get current Y position of the button
        int newX = x + 50; // Move the button 50 pixels to the right
        int newY = y + 50; // Move the button 50 pixels down
    
        // Ensure the button stays within the frame bounds
        if (newX + b1.getWidth() > getWidth()) {
            newX = x - 50; // Move left if it exceeds frame width
        } else if (newX < 0) {
            newX = x + 50; // Move right if it goes out of the left bound
        }
    
        if (newY + b1.getHeight() > getHeight()) {
            newY = y - 50; // Move up if it exceeds frame height
        } else if (newY < 0) {
            newY = y + 50; // Move down if it goes out of the top bound
        }
    
        b1.setBounds(newX, newY, b1.getWidth(), b1.getHeight()); // Update button position
    }
    public void mouseExited(MouseEvent me) {
    }
    public void mouseReleased(MouseEvent me) {
    }
    public static void main(String args[]) {
        Mouse f1=new Mouse();
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setTitle("Mouse Event Frame");
        f1.setLayout(new FlowLayout());
    }
}
