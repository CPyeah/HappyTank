package org.cp.tank;

import java.awt.Frame;
import java.awt.Graphics;

public class TankFrame extends Frame{
	
	private int x =50, y=50;
	
	public TankFrame() {
		this.setSize(800, 500);
		this.setResizable(false);
		this.setVisible(true);
		
	}

	/**
	 * 虚拟机自动调用
	 * 自动生成graphics（画笔）对象
	 */
	@Override
	public void paint(Graphics g) {
		System.out.println("paint...");
		g.fillRect(x, y, 50, 50);
		x++;
	}

}
