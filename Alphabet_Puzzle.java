package cse215_project;

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JFrame;
import javax.swing.JOptionPane;  
public class Alphabet_Puzzle extends JFrame implements ActionListener{
    
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;  
    Container c;
    GridLayout g;
    Font f;
    int c10=0;
    int c1=0;
    int c2=0;
    int c3=0;
    int c4=0;
    int c5=0;
    int c6=0;
    int c7=0;
    int c8=0;
    int c9=0;

    Alphabet_Puzzle(){
        
        super("Alphabet Puzzle");  
        g=new GridLayout(3,3,5,5);
        c= this.getContentPane();
        f=new Font("Arial",Font.BOLD,30);
   
        c.setLayout(g);
        c.setBackground(Color.WHITE);
   
        b1=new Button("A");
        b1.setFont(f);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.RED);
        b1.setBounds(50,100,40,40); 
   
        b2=new Button("C");  
        b2.setFont(f);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.RED);
      
        b2.setBounds(100,100,40,40);  
        b3=new Button("D");  
        b3.setFont(f);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.RED);
        b3.setBounds(150,100,40,40);  
        b4=new Button("E");
        b4.setFont(f);
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.RED);
        b4.setBounds(50,150,40,40);  
        b5=new Button("H"); 
        b5.setFont(f);
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.RED);
        b5.setBounds(100,150,40,40);  
        b6=new Button("F"); 
        b6.setFont(f);
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.RED);
        b6.setBounds(150,150,40,40);  
        b7=new Button("B");  
        b7.setFont(f);
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.RED);
        b7.setBounds(50,200,40,40);  
        b8=new Button("");  
        b8.setFont(f);
        b8.setForeground(Color.WHITE);
        b8.setBackground(Color.RED);
        b8.setBounds(100,200,40,40);  
        b9=new Button("G");  
        b9.setFont(f);
        b9.setForeground(Color.WHITE);
        b9.setBackground(Color.RED);
        b9.setBounds(150,200,40,40);  
      
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
        b4.addActionListener(this);  
        b5.addActionListener(this);  
        b6.addActionListener(this);  
        b7.addActionListener(this);  
        b8.addActionListener(this);  
        b9.addActionListener(this);  
      
  
        setSize(600,600);  
   
        setVisible(true);  
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);
        c.add(b9);
    
    }  
    @Override
    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==b1){  
        c1++;
        String label=b1.getLabel();  
        if(b2.getLabel().equals("")){  
            
            b2.setLabel(label);  
            b1.setLabel("");  
        }  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b1.setLabel("");  
        }  
    }  
    if(e.getSource()==b2){  
        c2++;
        String label=b2.getLabel();  
        if(b1.getLabel().equals("")){  
            b1.setLabel(label);  
            b2.setLabel("");  
        }  
        if(b3.getLabel().equals("")){  
          
            b3.setLabel(label);  
            b2.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b2.setLabel("");  
        }  
        }  
        if(e.getSource()==b3){  
        c3++;
        String label=b3.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b3.setLabel("");  
        }  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b3.setLabel("");  
        }  
        }  
        if(e.getSource()==b4){  
        c4++;
        String label=b4.getLabel();  
        if(b1.getLabel().equals("")){  
            b1.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b7.getLabel().equals("")){  
            b7.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b4.setLabel("");  
        }  
        }  
        if(e.getSource()==b5){  
        c5++;
        String label=b5.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b5.setLabel("");  
        }  
        }  
        if(e.getSource()==b6){  
        c6++;
        String label=b6.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b3.getLabel().equals("")){  
            b3.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b6.setLabel("");  
        }  
        }  
        if(e.getSource()==b7){  
        c7++;
        String label=b7.getLabel();  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b7.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b7.setLabel("");  
        }  
        }  
        if(e.getSource()==b8){  
        c8++;
        String label=b8.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b7.getLabel().equals("")){  
            b7.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b8.setLabel("");  
        }  
        }  
        if(e.getSource()==b9){  
        c9++;
        String label=b9.getLabel();  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b9.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b9.setLabel("");  
        }  
        }  
        c10=c1+c2+c3+c4+c5+c6+c7+c8+c9; 
        //congrats code  
        if(b1.getLabel().equals("A")&&b2.getLabel().equals("B")&&b3.getLabel()    
            .equals("C")&&b4.getLabel().equals("D")&&b5.getLabel().equals("E")    
            &&b6.getLabel().equals("F")&&b7.getLabel().equals("G")&&b8.getLabel()    
            .equals("H")&&b9.getLabel().equals("")){     
            JOptionPane.showMessageDialog(this,"Congratulations! You won.TTOl movies "+c10);    
        }    
    }  
    public static void main(String[] args) {  
        Alphabet_Puzzle frame=new Alphabet_Puzzle();  
  
    }  
}  


