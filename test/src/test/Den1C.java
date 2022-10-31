import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Den1C {
	
	static int current=0,count=0;
	public static void main(String[] args) {
		JFrame f=new JFrame("QUİZ APP");
	 
		//bileşenleri oluşturmak için 
		JLabel soru=new JLabel("Que1: Which one among these is not a primitive datatype?");
		JRadioButton c1=new JRadioButton("A)int");
		JRadioButton c2=new JRadioButton("B)Float");
		JRadioButton c3=new JRadioButton("C)Boolean");
		JRadioButton c4=new JRadioButton("D)char");
		JButton next=new JButton("Sonraki Soru");
		JButton sonuc=new JButton("Sonuc");
		JButton geri=new JButton("Geri");
		//Radio Button özeliği ekleme 
		ButtonGroup bg=new ButtonGroup();
		bg.add(c1);
		bg.add(c2);
		bg.add(c3);
		bg.add(c4);
		
		//bileşenlerin konumlarını ayarlamak için 
		soru.setBounds(30,40,450,20);
		c1.setBounds(50,80,120,20);
		c2.setBounds(50,110,120,20);
		c3.setBounds(50,140,120,20);
		c4.setBounds(50,170,120,20);
		next.setBounds(100,240,150,30);
		sonuc.setBounds(270,240,150,30);
		geri.setBounds(300,240,200,30);
		//bileşenleri pencereye dahil etmek
		f.add(soru);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(next);
		f.add(sonuc);
		f.add(geri);
		
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==next) {
					
					if(check()) {
						count=count+1;}
					System.out.println(count);
					current++;
					set();
					
					if(current==10) {
						next.setEnabled(false);
						sonuc.setText("Quiz Bitti");
						JOptionPane.showMessageDialog(null,"Doğru Sonuclar"+count);
					}
					
				}
			}
			
			void set() {
			
				
				if(current==1) {
					soru.setText("Que2: Which class is available to all the class automatically?");
					c1.setText("A)Swing");
					c2.setText("B)Applet");
					c3.setText("C)Object");
					c4.setText("D)ActionEvent");
				}
				if(current==2) {
					soru.setText("Que3: Which package is directly available to our class without importing it?");
					c1.setText("A)swing");
					c2.setText("B)applet");
					c3.setText("A)net");
					c4.setText("A)lang");
				}
				if(current==3) {
					soru.setText("soru 4) Soru Alanı");
					c1.setText("A) 4. soru cevap 1");
					c2.setText("B) 4. soru cevap 2 ");
					c3.setText("C) 4.soru cevap 3");
					c4.setText("D)4. soru cevap 4");
				}
				if(current==4) {
					soru.setText("soru 5) Soru Alanı");
					c1.setText("A) 5. soru cevap 1");
					c2.setText("B) 5. soru cevap 2 ");
					c3.setText("C) 5.soru cevap 3");
					c4.setText("D)5. soru cevap 4");
				}
				if(current==5) {
					soru.setText("soru 6) Soru Alanı");
					c1.setText("A) 6. soru cevap 1");
					c2.setText("B) 6. soru cevap 2 ");
					c3.setText("C) 6.soru cevap 3");
					c4.setText("D)6. soru cevap 4");
				}
				if(current==6) {
					soru.setText("soru 7 ) Soru Alanı");
					c1.setText("A) 7. soru cevap 1");
					c2.setText("B) 7. soru cevap 2 ");
					c3.setText("C) 7.soru cevap 3");
					c4.setText("D)7. soru cevap 4");
				}
				if(current==7) {
					soru.setText("soru 8) Soru Alanı");
					c1.setText("A) 8. soru cevap 1");
					c2.setText("B) 8. soru cevap 2 ");
					c3.setText("C) 8.soru cevap 3");
					c4.setText("D)8. soru cevap 4");
				}
				if(current==8) {
					soru.setText("soru 9) Soru Alanı");
					c1.setText("A) 9. soru cevap 1");
					c2.setText("B) 9. soru cevap 2 ");
					c3.setText("C) 9.soru cevap 3");
					c4.setText("D)9. soru cevap 4");
				}
				if(current==9) {
					soru.setText("soru 10) Soru Alanı");
					c1.setText("A) 10. soru cevap 1");
					c2.setText("B) 10. soru cevap 2 ");
					c3.setText("C) 10.soru cevap 3");
					c4.setText("D)10. soru cevap 4");
				}
				bg.clearSelection(); 
			}
		
			
			 boolean check()  
			    {  
			        if(current==0)  { return(c1.isSelected());  }
			           
			        if(current==1)  
			            return(c2.isSelected());  
			        if(current==2)  
			            return(c3.isSelected());  
			        if(current==3)  
			            return(c4.isSelected());  
			        if(current==4)  
			            return(c4.isSelected());  
			        if(current==5)  
			            return(c1.isSelected());  
			        if(current==6)  
			            return(c1.isSelected());  
			        if(current==7)  
			            return(c1.isSelected());  
			        if(current==8)  
			            return(c1.isSelected());  
			        if(current==9)  
			            return(c4.isSelected());  
			        return false;  
			    } 
		});
		
		sonuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Doğru Sonuclar"+count);
			}
		});	
		
		//pencere oluşturma özelikleri
		f.setLocation(100,20);
		f.setSize(500,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
