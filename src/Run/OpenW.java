package Run;

import javax.swing.JFrame;

import Window.CopySims;

public class OpenW extends JFrame {

	public static void main(String[] args) {
		
		CopySims sims = new CopySims();
		sims.setDefaultCloseOperation(EXIT_ON_CLOSE);
		sims.setVisible(true);
		//sims.setLocation(500,400);
		sims.setLocationRelativeTo(null);
		
	}

}
