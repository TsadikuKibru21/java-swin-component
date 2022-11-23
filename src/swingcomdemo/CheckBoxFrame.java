/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingcomdemo;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;

public class CheckBoxFrame extends JFrame {

    private JTextField textField;
    private JCheckBox boldJCheckBox;
    private JCheckBox italicJCheckBox;

    public CheckBoxFrame() {
        super("JCheckBox Test");
        setLayout(new FlowLayout()); // set frame layout
        textField = new JTextField("This is font demo with chekbox", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField); // add textField to JFrame

        boldJCheckBox = new JCheckBox("Bold"); // create bold checkbox
        italicJCheckBox = new JCheckBox("Italic"); // create italic
        add(boldJCheckBox); // add bold checkbox to JFrame
        add(italicJCheckBox); // add italic checkbox to JFrame
        String country[] = {"Ethiopia", "India", "Aus", "U.S.A",
            "England", "Newzeland"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50, 0, 90, 20);
        add(cb);
        // register listeners for JCheckBoxes
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
    } // end CheckBoxFrame constructor

    private class CheckBoxHandler implements ItemListener {

        public void itemStateChanged(ItemEvent event) {
            Font font = null;
            if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (boldJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);
            } else if (italicJCheckBox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else {
                font = new Font("Serif", Font.PLAIN, 14);
            }
            textField.setFont(font);
        }

    }

    public static void main(String[] args) {
        CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
        checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBoxFrame.setSize(275, 200); // set frame size
        checkBoxFrame.setVisible(true); // display frame
    } // end main
}
