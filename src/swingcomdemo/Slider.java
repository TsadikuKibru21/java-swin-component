/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingcomdemo;

import javax.swing.*;

public class Slider extends JFrame {

    public Slider() {
        JSlider slider = new JSlider(JSlider.VERTICAL,1,10,1);
        JPanel panel = new JPanel();
        panel.add(slider);

        add(panel);
    }

    public static void main(String s[]) {
        Slider frame = new Slider();
        frame.pack();
        frame.setVisible(true);
    }
}
