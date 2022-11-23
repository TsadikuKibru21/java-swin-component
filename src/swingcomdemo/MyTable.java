/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingcomdemo;

import javax.swing.*;

public class MyTable {

    JFrame f;

    MyTable() {
        f = new JFrame();
        String row[][] = {{"101", "Alex", "670000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},
        {"102", "man", "780000"},};
        String column[] = {"ID", "NAME", "SALARY"};
        JTable jt = new JTable(row, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
//  f.setLayout(null);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyTable();
    }
}
