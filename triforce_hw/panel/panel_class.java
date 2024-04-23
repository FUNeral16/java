package panel;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

import java.lang.Math;
import java.util.Arrays;

public class panel_class extends JPanel{
	
	int panel_width = 500;
	int panel_height = 500;
	int center_x = panel_width / 2;
	int center_y = panel_height / 2;
	int length;
	int height;
	int length_half;
	int height_half;

	public panel_class(int length){
		System.out.println("토끼");
		System.out.println("판으로");

		// These are equilateral triangles of length='length' and height=(length/2)*sqrt(3)
		this.length = length;
		this.height = (int) Math.round((Math.sqrt(3)*((double)this.length/2)));
		this.length_half = (int)Math.round((double) length / 2);
		this.height_half = (int)Math.round((double) height / 2);
		
		Dimension d = new Dimension(panel_width, panel_height);
		this.setPreferredSize(d);

	}

	public void paint(Graphics g){
		Graphics2D graphics = (Graphics2D) g;

		// Calculate the coordinates for each of the triangles based on the center of the panel.
		// points will be listed from bottom-left, bottom-right, top.
		// origin (0,0) is on the top-left corner. X coordinates increment from left to right.
		// Y coordinates increment from top to bottom.
		//
		// Coordinates for a triangle that is centered.
		// int x_b_l = center_x - length_half;
		// int x_b_r = center_x + length_half;
		// int x_t = center_x;
		// int [] c_x = {x_b_l, x_b_r, x_t};
		// int y_b_l = center_y + height_half;
		// int y_b_r = center_y + height_half;
		// int y_t = center_y - height_half;
		// int [] c_y = {y_b_l, y_b_r, y_t};

		// Coordinates for the 'tri-force', 3 equilateral triangles, that is centered.
		// Bottom left triangle.
		int bot_left_x1 = center_x - length;
		int bot_left_x2 = center_x;
		int bot_left_x3= center_x - length_half;
		int [] b_l_x = {bot_left_x1, bot_left_x2,bot_left_x3};
		int bot_left_y1 = center_y + height;
		int bot_left_y2 = center_y + height;
		int bot_left_y3 = center_y;
		int [] b_l_y = {bot_left_y1, bot_left_y2, bot_left_y3};

		// Bottom right triangle.
		int bot_right_x1 = center_x;
		int bot_right_x2 = center_x + length;
		int bot_right_x3 = center_x + length_half;
		int [] b_r_x = {bot_right_x1, bot_right_x2, bot_right_x3};
		int bot_right_y1 = center_y + height;
		int bot_right_y2 = center_y + height;
		int bot_right_y3 = center_y;
		int [] b_r_y = {bot_right_y1, bot_right_y2, bot_right_y3};

		// Top triangle.
		int top_x1 = center_x - length_half;
		int top_x2 = center_x + length_half;
		int top_x3 = center_x;
		int [] t_x = {top_x1, top_x2, top_x3};
		int top_y1 = center_y;
		int top_y2 = center_y;
		int top_y3 = center_y - height;
		int [] t_y = {top_y1, top_y2, top_y3};
			
		graphics.setPaint(Color.green);
		graphics.fillPolygon(b_l_x, b_l_y, 3);
		graphics.fillPolygon(b_r_x, b_r_y, 3);
		graphics.fillPolygon(t_x, t_y, 3);

		// Draw x, y axis to confirm the triangle is centered.
		// draw y-xis
		graphics.setPaint(Color.black);
		graphics.drawLine(center_x, 0, center_x, center_y);
		graphics.setPaint(Color.pink);
		graphics.drawLine(center_x, center_y, center_x, panel_height);
		// draw x-axis
		graphics.setPaint(Color.yellow);
		graphics.drawLine(0, center_y, center_x, center_y);
		graphics.setPaint(Color.gray);
		graphics.drawLine(center_x, center_y, panel_width, center_y);
	}
}
