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
    JButton btn1=new JButton("�\�U���");
    JButton btn2=new JButton("�إߧA���p�\�U");
  	Label lab=new Label();
    
    public test(){
        
        // 2.�]�m�n��ܤ���T�P����
        
        this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0);}});
	  
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
		
        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setOpaque(false);              // �NJPanel�]�m����z����
        wordLabel = new JLabel("Hello World!!");
        wordLabel.setBounds(10, 10, 100, 100);        // �]�m��m��e��
        contentPanel.add(wordLabel);
        this.getContentPane().add(contentPanel, BorderLayout.CENTER);
        
        // 3.��JFrame���]�m�I���Ϥ� - �Ϥ��L�k�Y��j�p
       // background = new ImageIcon(getClass().getResource("java.lang.String"));       // �I���Ϥ�
        bgLabel = new JLabel(background);      // ��I������ܦbLabel��
        bgLabel.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());    // ��t���I���Ϥ�Label��m�]�m���Ϥ���n��R��Ӫ���
        // �⤺�e�����ରJPanel�A�_�h����ϥ�setOpaque()�Өϵ����ܦ��z��
        imagePanel = (JPanel) this.getContentPane();
        imagePanel.setOpaque(false);
        this.getLayeredPane().add(bgLabel, new Integer(Integer.MIN_VALUE));     // ��I���ϲK�[����h���檺�̩��h�H�@���I��
        
        // 4.�]�mframe���򥻳]�w
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
		  JButton btn=(JButton) e.getSource();     // ���o�ƥ�ӷ�������
	      if(btn==btn1){// �p�G�O���Ubtn1���s
	         this.setVisible(false); 
	         new choice();
	    	
	        
	      }                       
	      else if(btn==btn2) {// �p�G�O���Ubtn2���s
	      	
	      }              
	        
		
	}
}