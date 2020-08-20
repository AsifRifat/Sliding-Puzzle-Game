package cse215_project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Number_Puzzle extends JFrame{
    JButton[][] sq = new JButton[3][3];
    int m,n;
    Font f;

    public Number_Puzzle()
            
    {
        Container container = getContentPane();
        container.setLayout(new GridLayout(3,3,10,10));
        ButtonListener pushed = new ButtonListener();
        f = new Font("Arial",Font.BOLD,30);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                JButton n = new JButton();
                sq[i][j] = n;
                sq[i][j].addActionListener(pushed);
                sq[i][j].setBackground(Color.green);
                container.add(sq[i][j]);
            }
        }
    }
   
    public void scramble()
    {
        boolean[] used = new boolean[9];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                int val = (int)(9*Math.random());
                while(used[val])
                {
                    val = (int)(9*Math.random());
                }
                used[val] = true;
                if(val!=0){
                    sq[i][j].setFont(f);
                    sq[i][j].setText(""+val);
                }
                else
                {
                    sq[i][j].setFont(f);
                    sq[i][j].setBackground(Color.gray);
                    m=i; n=j;
                }
            }
        }
    }


    class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Object square = e.getSource();
            
            for(int i=0; i<3; i++)
            {
                for(int j=0; j<3; j++)
                {
                    if(sq[i][j]== square)
                    {
                        moves(i,j);
                        //break outer;
                    }
                }
            }
        }
    }

    public void moves(int i, int j)
    {
        if((i+1==m && j==n) || (i-1==m && j==n) || (i==m && j+1==n) || (i==m && j-1==n))
        {
            sq[m][n].setText(sq[i][j].getText());
            sq[m][n].setBackground(Color.green);
            sq[i][j].setText("");
            sq[i][j].setBackground(Color.gray);
            m=i; n=j;
        }
    }
    public static void main(String args[])
    {
        Number_Puzzle game = new Number_Puzzle();
        game.setTitle("THE EIGHT PUZZLE");
        game.setVisible(true);
        game.setLocationRelativeTo(null);
        game.setSize(600,600);
        game.scramble();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}