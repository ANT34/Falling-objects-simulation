package simulation;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class falling_object{

	public static void main(String[] args) {
		JFrame frame = new JFrame("falling objects");
		frame.setBounds(100,100,520,540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		sim1 area = new sim1();
		area.setBounds(0,0,500,500);
		
		
		
		
		area.addMouseListener(new MouseAdapter() {
			
			int x,y;
			public void mousePressed(MouseEvent e) {
				x=e.getX();
				y=e.getY();
				area.lx=x;area.ly=y;
				//System.out.println(e.getX()+" "+e.getY());
			}
			public void mouseReleased(MouseEvent e) {
				System.out.println(e.getX()+" "+e.getY());
				area.ball.add(new ball(new double[] {(double)x,(double)y},new double[] {(double)(e.getX()-x)/50,(double)(e.getY()-y)/50},new double[] {0,0.1}));
			}
			public void mousedDragged(MouseEvent e) {
				System.out.println(e.getX()+" "+e.getY());
				area.lx1=e.getX();
				area.ly1=e.getY();
			}
			
		});
		
		frame.add(area);
		frame.setVisible(true);
		area.run();
	
	}
	

}
