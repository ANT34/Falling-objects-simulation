package simulation;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class sim1 extends Canvas{
	
	//double[] position,speed,acceleration;
	ArrayList<ball> ball;
	int lx,ly,lx1,ly1;

	sim1() {
		// TODO Auto-generated method stub
		ball=new ArrayList<ball>();
		lx=0;
		ly=0;
		lx1=0;
		ly1=0;
		ball.add(new ball(new double[]{6,10}, new double[]{0.5,1},new double[]{0,0.1}));
		repaint();
		
		
		

	}
	
	public void run() {
		while(true) {
			if (ball.size() >0) {
			for(int i = 0;i<ball.size();i++) {
				ball.get(i).update();}
				repaint();
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void paint(Graphics g) {
			super.paint(g);
			//g.drawLine(0, 250, 500, 250);
			//g.drawLine(lx,ly, lx1, ly1);
			g.drawLine(0, 499, 500, 499);
			//g.drawLine(250, 0, 250, 500);
			for(int i = 0;i<ball.size();i++) {
			g.fillOval((int)ball.get(i).position[0]-5,(int)ball.get(i).position[1]-5, 10, 10);}
			
	}
	

}