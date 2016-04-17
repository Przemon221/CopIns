package window_copins;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import myMethod.Copy;

public class FileList extends JFrame implements ActionListener {
	
	public JTextArea tList;
	
	public FileList()
	{
		setTitle("FileList");
		setSize(170, 500);
		setLayout(null);
		
		tList = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(tList);
		scrollPane.setBounds(0, 0, 150, 455);
		tList.setBounds(0, 0, 150, 455);
		
		add(scrollPane);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent y) {
		
		
		
	}

	
	
	
	
}
