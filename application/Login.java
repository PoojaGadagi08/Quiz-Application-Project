
package quiz.application;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
    
    JButton rules,back;
     JTextField tfname;
   Login(){
       getContentPane().setBackground(Color.WHITE);
       
       setLayout(null);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/Login.jpg"));
       JLabel image=new JLabel(i1);
       
       image.setBounds(0,0,1000,600);
       add(image);
       
       JLabel headings = new JLabel("WELCOME ! ");
       headings.setBounds(1200,100,350,45);
       headings.setFont(new Font("Mongolian Baiti",Font.BOLD,50));
       add(headings);
       
       
       JLabel name = new JLabel("Enter your name ");
       name.setBounds(1100,200,200,50);
       name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
       add(name);
       
        tfname =new JTextField();
       tfname.setBounds(1255,200,300,45);
       tfname.setFont(new Font("Times New Roman",Font.LAYOUT_LEFT_TO_RIGHT,20));
       add(tfname);
       
        rules = new JButton("Rules");
       rules.setBounds(1100,400,200,45);
       rules.addActionListener(this);
       add(rules);
       
       
         back = new JButton("Back");
       back.setBounds(1400,400,200,45);
       back.addActionListener(this);
       add(back);
       
       
       
       setSize(1500,900);
       setLocation (250,100);
        setVisible(true);
        
    }
   
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==rules){
           String name=tfname.getText();
           setVisible(false);
           new Rules(name);
       }
       else if (ae.getSource() == back){
           setVisible(false);
       }
       
   }
    public static void main(String[] args) {
       new Login();
        
    }
}
