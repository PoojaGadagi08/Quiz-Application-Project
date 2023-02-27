package quiz.application;



import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{
    
    String questions[][]=new String[10][5];
    String answers[][]=new String[10][2];
    String userAns[][]=new String[10][1];
    
     JLabel qno,q;
     JRadioButton op1,op2,op3,op4;
      ButtonGroup grp;
      
      JButton next ,LifeLine,Submit;
     
     public static int timer=15;
     public static int ans_given=0;
     public static int Score=0;
     
     public static int a=0;
     
     String name;
    Quiz(String name){
        
        this.name=name;
        setSize(1500,900);
       setLocation (250,100);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/Quiz.jpg"));
       JLabel image=new JLabel(i1);
       
       image.setBounds(0,0,1000,600);
       add(image);
       
        qno=new JLabel();
       qno.setBounds(800,180,500,100);
       qno.setFont(new Font("Mongolian Baiti",Font.BOLD,50));
       add(qno);
       
          q=new JLabel();
       q.setBounds(900,200,1000,50);
       q.setFont(new Font("Tahuma",Font.PLAIN,30));
       add(q);
       
       questions[0][0] = "Number of primitive dataTypes in java?";
        questions[0][1] = "6";
        questions[0][2] = "7";
        questions[0][3] = "8";
        questions[0][4] = "9";

        questions[1][0] = "Array in java are?";
        questions[1][1] = "Objexts reference";
        questions[1][2] = "Object";
        questions[1][3] = "primitive data type";
        questions[1][4] = "none";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = " When the objects created with new?";
        questions[4][1] = "At run time";
        questions[4][2] = "At complie time";
        questions[4][3] = "none";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] ="What is the size of float and double?";
        questions[9][1] = "32 and 64";
        questions[9][2] = "32 and 32";
        questions[9][3] = "64 and 64";
        questions[9][4] = "64 28";
        
        answers[0][1] = "8";
        answers[1][1] = "Objects";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "At run time";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "32 and 64";
        
         op1= new JRadioButton("Option 1");
        op1.setBounds(900,250,1000,40);
        op1.setBackground(Color.WHITE);
        op1.setFont(new Font ("Dialog",Font.PLAIN,20));
        add(op1);
        
          op2= new JRadioButton("Option 2");
        op2.setBounds(900,300,1000,40);
        op2.setBackground(Color.WHITE);
        op2.setFont(new Font ("Dialog",Font.PLAIN,20));
        add(op2);
        
          op3= new JRadioButton("Option 3");
        op3.setBounds(900,350,1000,40);
        op3.setBackground(Color.WHITE);
        op3.setFont(new Font ("Dialog",Font.PLAIN,20));
        add(op3);
        
          op4= new JRadioButton("Option 4");
        op4.setBounds(900,400,1000,40);
        op4.setBackground(Color.WHITE);
        op4.setFont(new Font ("Dialog",Font.PLAIN,20));
        add(op4);
        
         grp=new ButtonGroup();
        grp.add(op1);
         grp.add(op2);
          grp.add(op3);
           grp.add(op4);
        
          next = new JButton("Next");
       next.setBounds(1100,500,200,45);
       next.addActionListener(this);
       add(next);
       
        LifeLine = new JButton(" 50-50 LifeLine");
       LifeLine.setBounds(1100,550,200,45);
       LifeLine.addActionListener(this);
       add(LifeLine);
       
         Submit = new JButton("Submit");
       Submit.setBounds(1100,600,200,45);
       Submit.setEnabled(false);
        Submit.addActionListener(this);
       add(Submit);
       
       Start(a);
       
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
            repaint();
            
            ans_given=1;
            if(grp.getSelection()==null){
                userAns[a][0]="";
            }else{
                userAns[a][0]=grp.getSelection().getActionCommand();
            }
            
            if(a==8){
                next.setEnabled(false);
                Submit.setEnabled(true);
            }
            
            a++;
            Start(a);
        }else if(ae.getSource()==LifeLine){
            if(a==2 || a==4 ||a==6 ||a==8 || a==9){
                op2.setEnabled(false);
                op3.setEnabled(false);
            }else{
                op1.setEnabled(false);
                op4.setEnabled(false);
            }
            LifeLine.setEnabled(false);
            
        }else if(ae.getSource()==Submit){
            ans_given=1;
            
            if(grp.getSelection()==null){
                userAns[a][0]="";
            }else{
                userAns[a][0]=grp.getSelection().getActionCommand();
            }
                   for(int i=0;i<userAns.length;i++){
                       if(userAns[i][0].equals(answers[i][1])){
                           Score+=10;
                           
                       }else{
                           Score+=0;
                       }
                   } 
                   setVisible(false);
                   new Score(name,Score);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
         op1.setEnabled(true);
             op2.setEnabled(true);
              op3.setEnabled(true);
               op4.setEnabled(true);
        
        String time="Time Left - " + timer + " Seconds";//15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.PLAIN,25));
        
        if(timer>0){
            g.drawString(time, 1500,70);
        }
        else{
           g.drawString("Times Up ! ", 1500,70);  
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given==1){
            ans_given=0;
            timer=15;
        }else if(timer<0){
            timer=15;
            
            op1.setEnabled(true);
             op2.setEnabled(true);
              op3.setEnabled(true);
               op4.setEnabled(true);
               
                 if(a==8){
                next.setEnabled(false);
                Submit.setEnabled(true);
            }
                 
            if(a==9){//sumbit
                      if(grp.getSelection()==null){
                userAns[a][0]="";
            }else{
                userAns[a][0]=grp.getSelection().getActionCommand();
            }
                   for(int i=0;i<userAns.length;i++){
                       if(userAns[i][0].equals(answers[i][1])){
                           Score+=10;
                           
                       }else{
                           Score+=0;
                       }
                   } 
                   setVisible(false);
           new Score(name,Score);
            }else{//next
                     
            if(grp.getSelection()==null){
                userAns[a][0]="";
            }else{
                userAns[a][0]=grp.getSelection().getActionCommand();
            }
            a++;
            Start(a);
        }
    }
    }
    public void Start(int c){
        qno.setText(""+(c+1)+".");
        q.setText(questions[c][0]);
        op1.setText(questions[c][1]);
        op1.setActionCommand(questions[a][1]);
        
         op2.setText(questions[c][2]);
         op2.setActionCommand(questions[a][2]);
        
          op3.setText(questions[c][3]);
          op3.setActionCommand(questions[a][3]);
        
           op4.setText(questions[c][4]);
           op4.setActionCommand(questions[a][4]);
           
           
           grp.clearSelection();
        
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}
