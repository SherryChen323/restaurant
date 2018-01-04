package restaurant;

import java.awt.*;
import java.awt.event.*;


public class choice extends Frame implements ActionListener{

	static Label lab1=new Label();
	static Label lab2=new Label();
	static Label lab3=new Label();
	static Checkbox ckb1=new Checkbox("A");
	static Checkbox ckb2=new Checkbox("B");
	static Checkbox ckb3=new Checkbox("100以下");
	static Checkbox ckb4=new Checkbox("100~200");
	static Checkbox ckb5=new Checkbox("200以上");
	static Checkbox ckb6=new Checkbox("是");
	static Checkbox ckb7=new Checkbox("否");
	static Button btn=new Button("PUSH!");
	
	public choice(){
		
		btn.addActionListener(this); 
		
		lab1.setText("地區:");
		lab2.setText("價位:");
		lab3.setText("素食:");
		
		lab1.setLocation(20,40);
		lab2.setLocation(20,80);
		lab3.setLocation(20,120);
		
		lab1.setSize(60,40);
		lab2.setSize(60,40);
		lab3.setSize(60,40);
		
		Font fnt=new Font("微軟正黑體",Font.PLAIN,25);	
		lab1.setFont(fnt);
		lab2.setFont(fnt);
		lab3.setFont(fnt);
		ckb1.setFont(fnt);
		ckb2.setFont(fnt);
		ckb3.setFont(fnt);
		ckb4.setFont(fnt);
		ckb5.setFont(fnt);
		ckb6.setFont(fnt);
		ckb7.setFont(fnt);
		btn.setFont(fnt);
		
		this.add(lab1);
		this.add(lab2);
		this.add(lab3);
		
		CheckboxGroup grp1=new CheckboxGroup();
		CheckboxGroup grp2=new CheckboxGroup();
		CheckboxGroup grp3=new CheckboxGroup();
		ckb1.setBounds(90,40,120,40);
		ckb2.setBounds(220,40,120,40);
		ckb1.setCheckboxGroup(grp1);
		ckb2.setCheckboxGroup(grp1);
		
		ckb3.setBounds(90,80,120,40);
		ckb4.setBounds(220,80,120,40);
		ckb5.setBounds(350,80,120,40);
		ckb3.setCheckboxGroup(grp2);
		ckb4.setCheckboxGroup(grp2);
		ckb5.setCheckboxGroup(grp2);
		
		ckb6.setBounds(90,120,120,40);
		ckb7.setBounds(220,120,120,40);
		ckb6.setCheckboxGroup(grp3);
		ckb7.setCheckboxGroup(grp3);
		
		this.add(ckb1);
		this.add(ckb2);
		this.add(ckb3);
		this.add(ckb4);
		this.add(ckb5);
		this.add(ckb6);
		this.add(ckb7);
		
		this.setLocation(300,150);
		this.setLayout(null);
        this.setSize(700,450);
        btn.setBounds(560,370,100,40);
        this.add(btn);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
		  public void windowClosing(WindowEvent e) {System.exit(0);}});
  }
  

  	public void actionPerformed(ActionEvent e)
  	{
  		this.setBackground(Color.yellow);
  	}
  
  
}