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
	
   static JButton btn1=new JButton("餐廳選擇");
   static JButton btn2=new JButton("建立你的小餐廳");
   static Label lab=new Label();
    
   public food(){
      this.addWindowListener(new WindowAdapter(){
	  public void windowClosing(WindowEvent e) {System.exit(0);}});
	  System.out.println("test");
	  btn1.addActionListener(this);     // 把事件傾聽者frm向btn1註冊
      btn2.addActionListener(this);     // 把事件傾聽者frm向btn2註冊
     
      lab.setText("今天你要吃什麼?");
      lab.setBackground(Color.white);
      lab.setAlignment(Label.CENTER);
      lab.setForeground(Color.blue);
      lab.setLocation(100,100);          // 設定標籤位置
      lab.setSize(500,150);             // 設定標籤大小
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
      JButton btn=(JButton) e.getSource();     // 取得事件來源的物件
      if(btn==btn1){// 如果是按下btn1按鈕
         this.setVisible(false); 
         new eatWhat();
        	      
      }                       
      else if(btn==btn2) {// 如果是按下btn2按鈕
      	
      }              
        
   }
   
   
   public static void main(String[] args) {
   		new food();
    }
   
  
}
