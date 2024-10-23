import java.awt.*;
import java.awt.event.*;
class calculator implements ActionListener
{
 Frame f=new Frame();
 Label l1=new Label("First Number");
 Label l2=new Label("Second Number");
 Label l3=new Label("Result");

 TextField t1=new TextField();
 TextField t2=new TextField();
 TextField t3=new TextField();

Button sum=new Button("+");
 Button sub=new Button("-");
 Button mul=new Button("x");
 Button divi=new Button("/");
 Button percent=new Button("%");
 Button modul=new Button("Modulus");

 calculator()
 {
 l1.setBounds(100,100,150,30);
 l2.setBounds(100,140,150,30);
 l3.setBounds(100,180,150,30);

 t1.setBounds(300,100,150,30);
 t2.setBounds(300,140,150,30);
 t3.setBounds(300,180,150,30);

 sum.setBounds(50,350,60,30);
 sub.setBounds(110,350,60,30);
 mul.setBounds(170,350,60,30);
 divi.setBounds(230,350,60,30);
 modul.setBounds(290,350,60,30);
 percent.setBounds(350,350,60,30);

 f.add(l1);
 f.add(l2);
 f.add(l3);

 f.add(t1);
 f.add(t2);
 f.add(t3);

 f.add(sum);
 f.add(sub);
 f.add(mul);
 f.add(divi);
 f.add(modul);
 f.add(percent);

 sum.addActionListener(this);
 sub.addActionListener(this);
 mul.addActionListener(this);
 divi.addActionListener(this);
 modul.addActionListener(this);
 percent.addActionListener(this);

 f.setLayout(null);
 f.setVisible(true);
 f.setSize(500,400);
 }

 public void actionPerformed(ActionEvent e)
 {
 float n1=Integer.parseInt(t1.getText());
 float n2=Integer.parseInt(t2.getText());

 if(e.getSource()==sum)
 {
 t3.setText(String.valueOf(n1+n2));
 }
 if(e.getSource()==sub)
 {
 t3.setText(String.valueOf(n1-n2));
 }
 if(e.getSource()==mul)
 {
 t3.setText(String.valueOf(n1*n2));
 }
 if(e.getSource()==divi)
 {
 t3.setText(String.valueOf(n1/n2));
 }
 if(e.getSource()==modul)
 {
 t3.setText(String.valueOf(n1%n2));
 }
 if(e.getSource()==percent)
 {
 t3.setText(String.valueOf((n1/n2)*100));
 }
 }

 public static void main(String...s)
 {
 new calculator();
 }
}