
package quiz.application;



import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    
    Score(String name,int Score){
        
        
        setSize(1500,900);
       setLocation (250,100);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/result.jpg"));
       Image i2=i1.getImage().getScaledInstance(500,350,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
       
       image.setBounds(0,0,1000,600);
       add(image);
       
         JLabel h=new JLabel("Thank You !"+ name);
       h.setBounds(800,180,500,100);
       h.setFont(new Font("Mongolian Baiti",Font.BOLD,50));
       add(h);
       
        JLabel h1=new JLabel("Your Score is "+Score);
       h1.setBounds(800,400,500,100);
       h1.setFont(new Font("Mongolian Baiti",Font.BOLD,50));
       add(h1);
       
       JButton p = new JButton("Play Again");
       p.setBounds(800,600,200,45);
       p.setEnabled(true);
        p.addActionListener(this);
       add(p);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Score("User",0);
    }
}
