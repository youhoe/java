import javax.swing.*;
import java.awt.event.*;
public class Menubar implements ActionListener{
JFrame f;
JMenuBar mb;
JMenu file,edit,help;
JMenuItem cut,copy,paste,selectAll;
JTextArea ta;
Menubar(){
f=new JFrame();
mb=new JMenuBar();
f.setJMenuBar(mb);
f.add(mb);
file=new JMenu("File");
edit=new JMenu("Edit");
help=new JMenu("Help");
mb.add(file);mb.add(edit);mb.add(help);
cut=new JMenuItem("Cut");
copy=new JMenuItem("Copy");
paste=new JMenuItem("Paste");
selectAll=new JMenuItem("SelectAll");
edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
cut.addActionListener(this);
copy.addActionListener(this);
paste.addActionListener(this);
selectAll.addActionListener(this);
ta=new JTextArea();
ta.setBounds(20,20,360,320);
f.add(ta);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==cut)
ta.cut();
if(e.getSource()==copy)
ta.copy();
if(e.getSource()==paste)
ta.paste();
if(e.getSource()==selectAll)
ta.selectAll();
}
public static void main (String args[])
{
new Menubar();
}
}