package Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{

    private JLabel lAbout,lAbout1,lAbout2,lAbout3;
    
    
    public About()
    {
        setTitle("About My");
        setSize(450, 150);
        setResizable(false);
        setLayout(null);
        
        lAbout= new JLabel();
        lAbout.setText("Name: Przemyslaw Matwiejczuk");
        lAbout.setBounds(120, 20, 200, 20);
        add(lAbout);
        
        lAbout1= new JLabel();
        lAbout1.setText("Field work: IT specialist");
        lAbout1.setBounds(120, 40, 200, 20);
        add(lAbout1);
        
        lAbout2= new JLabel();
        lAbout2.setText("Country: Poland");
        lAbout2.setBounds(120, 60, 200, 20);
        add(lAbout2);
        
        
        lAbout3= new JLabel();
        lAbout3.setText("Phone number: 694-303-506");
        lAbout3.setBounds(120, 80, 200, 20);
        add(lAbout3);
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    
    
}
