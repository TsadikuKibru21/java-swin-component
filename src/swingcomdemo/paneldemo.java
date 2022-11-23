/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingcomdemo;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class paneldemo extends JFrame {

    private JPanel Panel;
    private JButton[] buttons;

    public paneldemo() {
        super("Panel Demo");
        buttons = new JButton[5];
        Panel = new JPanel();
        Panel.setLayout(new GridLayout(1, buttons.length));
        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button " + (count + 1));
            Panel.add(buttons[count]);
        }
        add(Panel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        paneldemo pn = new paneldemo();
        pn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pn.setSize(450, 400);
        pn.setVisible(true);
    }
}
