package frame;

import javax.swing.JFrame;
import panel.panel_class;

public class frame_class extends JFrame{
	public frame_class(int length){

		// create a new panel_class object from the class panel_class in package panel
		panel_class p = new panel_class(length);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(p);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		System.out.println("Goodbye ");
	}

}
