package restaurant;
import java.awt.*;
import java.awt.event.*;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class food extends JFrame implements ActionListener{
	
   static JButton btn1=new JButton("�\�U���");
   static JButton btn2=new JButton("�إߧA���p�\�U");
   static Label lab=new Label();
    
   public food(){
      this.addWindowListener(new WindowAdapter(){
	  public void windowClosing(WindowEvent e) {System.exit(0);}});
	  System.out.println("test");
	  btn1.addActionListener(this);     // ��ƥ��ť��frm�Vbtn1���U
      btn2.addActionListener(this);     // ��ƥ��ť��frm�Vbtn2���U
     
      lab.setText("���ѧA�n�Y����?");
      lab.setBackground(Color.white);
      lab.setAlignment(Label.CENTER);
      lab.setForeground(Color.blue);
      lab.setLocation(100,100);          // �]�w���Ҧ�m
      lab.setSize(500,150);             // �]�w���Ҥj�p
      lab.setFont(new Font("TimesRoman",Font.BOLD,60));
      this.add(lab);
      
      this.setTitle("Food");
      this.setLayout(null);
      btn1.setBounds(100,300,200,80);
      btn2.setBounds(400,300,200,80);
      btn1.setFont(new Font("TimesRoman",Font.BOLD,20));
      btn2.setFont(new Font("TimesRoman",Font.BOLD,20));
      this.setSize(700,450);
      this.setLocation(300,150);
      
      this.add(btn1);
      this.add(btn2);
      this.setVisible(true);
      
	}
   public void actionPerformed(ActionEvent e){
      JButton btn=(JButton) e.getSource();     // ���o�ƥ�ӷ�������
      if(btn==btn1){// �p�G�O���Ubtn1���s
         this.setVisible(false); 
         new eatWhat();
        	      
      }                       
      else if(btn==btn2) {// �p�G�O���Ubtn2���s
      	
      }              
        
   }
   
   
   public static void main(String[] args) {
   		new food();
    }
   
  
}
