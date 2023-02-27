
package quiz.application;


import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    
    String name;
    JButton start,back;

    
    Rules(String name){
         this.name=name;
        
          getContentPane().setBackground(Color.WHITE);
          setLayout(null);
          
          JLabel headings = new JLabel("Follow The Rules ! "+name);
       headings.setBounds(100,100,500,45);
       headings.setFont(new Font("Mongolian Baiti",Font.BOLD,50));
       add(headings);
       
       JLabel rules = new JLabel();
       rules.setBounds(20,90,700,600);
       rules.setFont(new Font("Tahoma",Font.PLAIN,25));
       
       rules.setText(
            "<html>"+ 
                "1. The quiz will consists MCQ type question. " + "<br><br>" +
                "2. 10 points is awarded for the correct answer." + "<br><br>" +
                "3. No negative points for the wrong answer." + "<br><br>" +
                "4. You will get 15 seconds to answer the question." + "<br><br>" +
                
            "<html>"
);
       add(rules);
         
       
         back = new JButton("Back");
       back.setBounds(1400,400,200,45);
       back.addActionListener(this);
       add(back); 
       
        start = new JButton("Start");
       start.setBounds(1100,400,200,45);
       start.addActionListener(this);
       add(start);
       
          
          
          
       setSize(1500,900);
       setLocation (250,100);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==start){
             setVisible(false);
           new Quiz(name);
       }else{
             setVisible(false);
             new Login();
         }
     }
    public static void main(String[] args) {
        new Rules("user");
        
    }
}
