import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Mainframe extends JFrame {
    private JPanel jpn = new JPanel(new GridLayout(7,1,5,5));
    private JPanel jpn1 = new JPanel(new BorderLayout(5,5));
    private JPanel jpn2 = new JPanel(new GridLayout(3,3,3,3));
    private JButton[] jbnts= new JButton[9];
    private Container cp;
    public Mainframe(){
        initcomp();
    }
    private void initcomp(){

        this.setBounds(400,100,600,400);
        this.setLayout(new BorderLayout(5,5));
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        this.setLayout(null);
        cp = this.getContentPane();
        for (int i=0 ; i<9 ;i++){
            jbnts[i] = new JButton();
            jbnts[i].setEnabled(false);
            jbnts[i].setOpaque(true);
            jbnts[i].setBackground(new Color(128,128,128));
            jpn2.add(jbnts[i]);

        }
        cp.add(jpn2,BorderLayout.CENTER);


    }
}
