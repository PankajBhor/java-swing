import java.awt.*;
import javax.swing.*;
class JProgressBarDemo extends JFrame {
    JProgressBar jpb;
    JProgressBarDemo() {
        Container c=getContentPane();    
        c.setLayout(new FlowLayout());    
        jpb=new JProgressBar(0,3000);
        jpb.setStringPainted(true);
        c.add(jpb);
    }
    public void progress() {
        int i=0;
        while(i<=3000) {
            jpb.setValue(i);
            i=i+20;
            try {
                Thread.sleep(100);
            } 
            catch (Exception e) {
                System.out.println(e);  
            }
        }
        
    }
    public static void main(String args[]) {
        JProgressBarDemo f1=new JProgressBarDemo();
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setTitle("jprogressbar demo frame");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.progress();
    }
}
