package org.cp.tank;

import java.awt.Frame;

public class GameController {

	public static void main(String[] args) {
		Frame frame = new TankFrame();
		frame.repaint();//主动调用paint方法
		
		while(true) {
			frame.repaint();
			try {
				Thread.sleep(1000/40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
