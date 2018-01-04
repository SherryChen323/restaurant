package restaurant;
import java.awt.*;
import java.awt.event.*;
public class eatWhat extends Frame implements ActionListener{
   //static eatWhat frm=new eatWhat();
   static Button btn1=new Button("幫我挑一個");
   static Button btn2=new Button("列出所有餐廳");
   static Label lab=new Label();
   
   public eatWhat(){
      this.addWindowListener(new WindowAdapter(){
    	  public void windowClosing(WindowEvent e) {System.exit(0);}});
	   
	  btn1.addActionListener(this);     // 把事件傾聽者frm向btn1註冊
      btn2.addActionListener(this);     // 把事件傾聽者frm向btn2註冊
     
      lab.setText("吃什麼?");
      lab.setBackground(Color.white);
      lab.setAlignment(Label.CENTER);
      lab.setForeground(Color.red);
      lab.setLocation(100,100);          // 設定標籤位置
      lab.setSize(500,150);             // 設定標籤大小
      lab.setFont(new Font("TimesRoman",Font.BOLD,60));
      this.add(lab);
      
      this.setTitle("Food");
      this.setLayout(null);
      btn1.setBounds(100,300,200,80);
      btn2.setBounds(400,300,200,80);
      btn1.setFont(new Font("TimesRoman",Font.BOLD,25));
      btn2.setFont(new Font("TimesRoman",Font.BOLD,25));
      this.setSize(700,450);
      this.setLocation(300,150);
      this.add(btn1);
      this.add(btn2);
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent e){
      Button btn=(Button) e.getSource();     // 取得事件來源的物件
      if(btn==btn1){// 如果是按下btn1按鈕
         this.setVisible(false); 
         new choice();
    	
        
      }                       
      else if(btn==btn2) {// 如果是按下btn2按鈕
      	
      }              
        
   }
}
