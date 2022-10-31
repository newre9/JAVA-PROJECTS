package test;
//Usually you will require both swing and awt packages
//even if you are working with just swings.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class DenemeC {
	static JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,be,bc,bdot;
	static JTextField tf;
	static Double number,answer;
	static String str;
	static int secim ;
	static String op;
	static JLabel l;
		public static void main(String[] args) {
			JFrame f=new JFrame("Hesap Makina APP");
			// Button oluşturma 
			tf=new JTextField(16);
			tf.setEditable(false);//input kısmına herhangi bir değer girilmesine izin verilmiyecek 
			
			l=new JLabel(" ");
			bdot=new JButton(".");
			b0=new JButton("0");
			b1=new JButton("1");
			b2=new JButton("2");
			b3=new JButton("3");
			b4=new JButton("4");
			b5=new JButton("5");
			b6=new JButton("6");
			b7=new JButton("7");
			b8=new JButton("8");
			b9=new JButton("9");
			ba=new JButton("+");
			bs=new JButton("-");
			bm=new JButton("*");
			bd=new JButton("/");
			be=new JButton("=");
			bc=new JButton("C");
			//button bileşenleri panele ekleme
			JPanel p=new JPanel();
			p.add(l);
			p.add(tf);
			
			p.add(bm);
			p.add(b1);
			p.add(b2);
			p.add(b3);
			p.add(bd);
			p.add(b4);
			p.add(b5);
			p.add(b6);
			p.add(ba);
			p.add(b7);
			p.add(b8);
			p.add(b9);
			p.add(bs);
			p.add(b0);
			p.add(be);
			p.add(bc);
			p.add(bdot);
			//panel kısmını pencereye dahil etmek
			f.add(p);
			//Button Aktiflik durumları 
			b0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tf.setText(tf.getText()+"0");
					l.setText(l.getText()+"0");
				}
			});
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tf.setText(tf.getText()+"1");
					l.setText(l.getText()+"1");
				}
			});
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tf.setText(tf.getText()+"2");
					l.setText(l.getText()+"2");
				
				}
			});
			b3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tf.setText(tf.getText()+"3");
					l.setText(l.getText()+"3");
				}
			});
			b4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tf.setText(tf.getText()+"4");
					l.setText(l.getText()+"4");
				}
			});
			b5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tf.setText(tf.getText()+"5");
					l.setText(l.getText()+"5");
				}
			});
			b6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tf.setText(tf.getText()+"6");
					l.setText(l.getText()+"6");
				}
			});
			b7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tf.setText(tf.getText()+"7");
					l.setText(l.getText()+"7");
				}
			});
			b8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tf.setText(tf.getText()+"8");
					l.setText(l.getText()+"8");
				}
			});
			b9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tf.setText(tf.getText()+"9");
					l.setText(l.getText()+"9");
				}
			});
			bdot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tf.setText(tf.getText()+".");
					l.setText(l.getText()+".");
				}
			});
			ba.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				str=tf.getText();
				number=Double.parseDouble(tf.getText());
				System.out.println(number);
				tf.setText("");
				l.setText(str+"+");
				
				secim=1;
				}
			});
			bs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				str=tf.getText();
				number=Double.parseDouble(tf.getText());
				System.out.println(number);
				tf.setText("");
				l.setText(str+"-");
				secim=2;
				}
			});
			bm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				str=tf.getText();
				number=Double.parseDouble(tf.getText());
				System.out.println(number);
				tf.setText("");
				l.setText(str+"*");
				secim=3;
				}
			});
			bd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				str=tf.getText();
				number=Double.parseDouble(tf.getText());
				System.out.println(number);
				tf.setText("");
				l.setText(str+"/");
				secim=4;
				}
			});
			bc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tf.setText("");
					l.setText("0");
				}
			});
			be.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					switch(secim) {
					case 1:
						  answer = number + Double.parseDouble(tf.getText());
		                   
		                    	 l.setText(Double.toString(answer));
		                    
		                    tf.setText("");
	                       
						break;
					case 2:
						answer = number - Double.parseDouble(tf.getText());
	                    if (Double.toString(answer).endsWith(".0")) {
	                    	 l.setText(Double.toString(answer));
	                    } else {
	                    	 l.setText(Double.toString(answer));
	                    }
	                    tf.setText("");
						break;
					case 3:
						answer = number * Double.parseDouble(tf.getText());
	                    if (Double.toString(answer).endsWith(".0")) {
	                    	 l.setText(Double.toString(answer));
	                    } else {
	                    	 l.setText(Double.toString(answer));
	                    }
	                    tf.setText("");
			
						break;
					case 4:
						answer = number / Double.parseDouble(tf.getText());
	                    if (Double.toString(answer).endsWith(".0")) {
	                    	 l.setText(Double.toString(answer));
	                    } else {
	                    	 l.setText(Double.toString(answer));
	                    }
	                    tf.setText("");
						break;
					}
					
				}
			});
			//pencere özelikleri 
			f.setResizable(false);
			f.setSize(200,240);
			f.setLocation(300, 200);
			f.setVisible(true);
			
			
		}

	}
