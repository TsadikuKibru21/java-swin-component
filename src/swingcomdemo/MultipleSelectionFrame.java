

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MultipleSelectionFrame extends JFrame {

    private JList colorJList;
    private JList copyJList;
    private JButton copyJButton;
    private static final String[] colorName = {"Black", "Light Gray", "Light Gray", "Light Gray", "Light Gray", "Light Gray", "Light Gray", "Light Gray",
         "Light Gray", "Light Gray", "Light Gray", "Light Gray", "Light Gray", "Light Gray",
         "Light Gray", "Light Gray", "Light Gray", "Light Gray", "Light Gray"};

    public MultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());
        colorJList = new JList(colorName);
        colorJList.setVisibleRowCount(5);
        colorJList.setSelectionMode(
                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList)); // add list with scrollpane
        copyJButton = new JButton("Copy >>>"); // create copy button
        copyJButton.addActionListener(
                new ActionListener() // anonymous inner class 
        {
            @Override
            public void actionPerformed(ActionEvent event) {
                copyJList.setListData(colorJList.getSelectedValues());
            }
        });
        add(copyJButton);
        copyJList = new JList();
        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellWidth(100);
        copyJList.setFixedCellHeight(15);
        copyJList.setSelectionMode(
                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList));
    }

    public static void main(String[] args) {
        MultipleSelectionFrame multipleSelectionFrame
                = new MultipleSelectionFrame();
        multipleSelectionFrame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        multipleSelectionFrame.setSize(350, 150);
        multipleSelectionFrame.setVisible(true);
    }
}
