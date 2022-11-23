package swingcomdemo;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class swingcomdemo extends JFrame {

    JProgressBar jb;
    int i = 100;

    swingcomdemo() {
        jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 40, 200, 30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void iterate() {
        while (i <= 2000) {
            jb.setValue(i);
            i = i + 100;
            try {
                Thread.sleep(150);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        swingcomdemo m = new swingcomdemo();
        m.setVisible(true);
        m.iterate();
    }
}
