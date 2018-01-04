package restaurant;
import java.awt.*;
import java.awt.event.*;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class test extends JFrame implements ActionListener {
    JPanel contentPanel = null, imagePanel = null;
    JLabel wordLabel = null, bgLabel = null;
    ImageIcon background = null;
    JButton btn1=new JButton("餐廳選擇");
    JButton btn2=new JButton("建立你的小餐廳");
  	Label lab=new Label();
    
    public test(){
        
        // 2.設置要顯示之資訊與元件
        
        this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0);}});
	  
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
		
        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setOpaque(false);              // 將JPanel設置為具透明化
        wordLabel = new JLabel("Hello World!!");
        wordLabel.setBounds(10, 10, 100, 100);        // 設置位置跟寬高
        contentPanel.add(wordLabel);
        this.getContentPane().add(contentPanel, BorderLayout.CENTER);
        
        // 3.於JFrame中設置背景圖片 - 圖片無法縮放大小
       // background = new ImageIcon(getClass().getResource("java.lang.String"));       // 背景圖片
        bgLabel = new JLabel(background);      // 把背景圖顯示在Label中
        bgLabel.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());    // 把含有背景圖之Label位置設置為圖片剛好填充整個版面
        // 把內容視窗轉為JPanel，否則不能使用setOpaque()來使視窗變成透明
        imagePanel = (JPanel) this.getContentPane();
        imagePanel.setOpaque(false);
        this.getLayeredPane().add(bgLabel, new Integer(Integer.MIN_VALUE));     // 把背景圖添加到分層窗格的最底層以作為背景
        
        // 4.設置frame之基本設定
        //this.setMinimumSize(new java.awt.Dimension(900, 675));
        //this.setLocationRelativeTo(null);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new test();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		  JButton btn=(JButton) e.getSource();     // 取得事件來源的物件
	      if(btn==btn1){// 如果是按下btn1按鈕
	         this.setVisible(false); 
	         new choice();
	    	
	        
	      }                       
	      else if(btn==btn2) {// 如果是按下btn2按鈕
	      	
	      }              
	        
		
	}
}