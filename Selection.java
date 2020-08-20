package cse215_project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Selection extends JFrame {

    private Container c;
    private JButton b1, b2;
    private JLabel j1;
    Font f;
    Selection() {
        initComponents();
        f=new Font("Arial",Font.BOLD,20);
        b1.setFont(f);
        b2.setFont(f);
        j1.setFont(f);
    }

    public void initComponents() {

        c = this.getContentPane();
        c.setBackground(Color.BLACK);
        c.setLayout(null);
        b1 = new JButton("Click to start number puzzle");
        b1.setBackground(Color.RED);
        b1.setForeground(Color.white);
        b1.setBounds(80, 100, 350, 70);
        c.add(b1);
        j1 = new JLabel("Puzzle Game - CLICK TO PLAY");
        j1.setBounds(100, 50, 350, 50);
        j1.setForeground(Color.WHITE);
        c.add(j1);
        b2 = new JButton("Click to start Alphabet puzzzle");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.white);
        b2.setForeground(Color.WHITE);
        b2.setBounds(80, 200, 350, 70);
        c.add(b2);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Number_Puzzle frame = new Number_Puzzle();
                frame.setVisible(true);

                frame.setSize(600, 600);
                frame.scramble();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                JOptionPane.showMessageDialog(null, "You have selected Number puzzle game");

            }

        });
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Alphabet_Puzzle frame = new Alphabet_Puzzle();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null, "You have selected Alphabet puzzle game");

            }

        });

    }

    public static void main(String[] args) {
        Selection frame = new Selection();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }

}
