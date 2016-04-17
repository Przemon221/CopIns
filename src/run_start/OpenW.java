package run_start;

import javax.swing.JFrame;

import window_copins.CopySims;

public class OpenW extends JFrame {

	public static void main(String[] args) {
		
		CopySims sims = new CopySims();
		sims.setDefaultCloseOperation(EXIT_ON_CLOSE);
		sims.setVisible(true);
		//sims.setLocation(500,400);
		sims.setLocationRelativeTo(null);
		
	}

}
