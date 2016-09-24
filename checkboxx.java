import java.awt.*;
import java.awt.event.*;
public class checkboxx extends Frame
{
		Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
		public checkboxx()
		{
			Label l1=new Label("front end tools");
			cb1=new Checkbox("java",false);
			cb2=new Checkbox("asp.net",false);
			cb3=new Checkbox("html",false);
			Label l2=new Label("back end tools");
			cb4=new Checkbox("severs",false);
			cb5=new Checkbox("ms access",false);
			cb6=new Checkbox("oracle",false);
			Panel p1=new Panel();
			p1.setLayout(new GridLayout(5,2));
			p1.add(cb1);
			p1.add(cb2);
			p1.add(cb3);
			p1.add(cb4);
			p1.add(cb5);
			p1.add(cb6);
			add(p1);
			p1.add(l1);
			p1.add(l2);
			}
		public static void main(String args[])
			{
			checkboxx f=new checkboxx();
				f.setBackground(Color.pink);
				f.setVisible(true);
				f.setSize(400,400);
				
				}
				}
