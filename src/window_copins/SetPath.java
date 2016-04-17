package window_copins;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SetPath extends JFrame implements ActionListener {
	
	private JButton bSet,bOption;
	private JLabel lPath;
	private JTextField tPath;
	
	public SetPath()
	{
		setTitle("Set Acc Name");
		setSize(400,100);
		setResizable(false);
		setLayout(null);
		
		//przyciski 
		
		bSet = new JButton();
		bSet.setText("Set");
		bSet.setBounds(140, 50, 100, 20);
		add(bSet);
		
		bSet.addActionListener(this);
		
		bOption = new JButton();
		bOption.setText("Options");
		bOption.setBounds(280, 50, 100, 20);
		add(bOption);
		bOption.addActionListener(this);        
		
		
		lPath = new JLabel();
		lPath.setText("Name:");
		lPath.setBounds(40, 20, 100, 20);
		add(lPath);
		
		tPath = new JTextField();
		tPath.setText("For Example - John");
		tPath.setBounds(80, 20, 300, 20);
		add(tPath);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent z) {
	    Object zrodlo = z.getSource();
		
	    if(zrodlo==bSet)
	    {
	        try {
	            PrintWriter zapis = new PrintWriter("path.txt");
	            Scanner skaner = new Scanner(tPath.getText());
	            while (skaner.hasNext())
	            {
	                
	                zapis.println(skaner.nextLine());
	                
	                
	            }
	            zapis.close();
	            skaner.close();
	            JOptionPane.showMessageDialog(null,"Operation completed","Message",JOptionPane.INFORMATION_MESSAGE);
	        } catch (FileNotFoundException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	        }
	        
	        

	        
	    }
	    
	    else if(zrodlo==bOption)
        {
            Options wOption = new Options();
            wOption.setDefaultCloseOperation(HIDE_ON_CLOSE);
            wOption.setVisible(true);
            wOption.setLocationRelativeTo(null);
            
        }
	    
	    
	    }
	    
	   
		
		
				
		
}
