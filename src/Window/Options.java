package Window;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextField;

public class Options extends JFrame{
    
    private JTextField lPath1,lPath2,lPath3;
    private JButton bPath1_set;
    
    
    
    public Options()
    {   
        
        
        setTitle("Options_panel");
        setSize(450, 1000);
        setResizable(false);
        setLayout(null);
        //Tutaj beda opcje to do: Zmiana domyslnej scieszki przeszukiwania plikow
        
        lPath1 = new JTextField();
        lPath1.setBounds(20, 10, 330, 20);
        lPath1.setText("");
        add(lPath1);
        
        bPath1_set = new JButton();
        bPath1_set.setText("Set 1");
        bPath1_set.setBounds(355, 10, 80, 20);
        add(bPath1_set);
        
    }
    
 

}
