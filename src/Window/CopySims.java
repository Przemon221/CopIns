package Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import MojeMetody.AllCpyOp;
import MojeMetody.Copy;

public class CopySims extends JFrame implements ActionListener {
	
	
	
	private JLabel lPlace,lWhere;
	private JTextField tPlace,tWhere,tChoice,tInstall;
	private JCheckBox chList;
	private JButton bCopy,bPath,bSet,bInstall,bAbout,bGroup;
	private String place;
	private String where;
	String memory_path ="";
	
	
	public CopySims (){
		setTitle("CopySims");
		setSize(450, 150);
		setResizable(false);
		setLayout(null);
		
		lPlace = new JLabel();
		lPlace.setBounds(20,20,100,20);
		lPlace.setText("From where:");
		add(lPlace);
		
		lWhere = new JLabel();
		lWhere.setText("Where:");
		lWhere.setBounds(20, 40, 100, 20);
		add(lWhere);
		
		
		
		// przyciski 
		
		bCopy = new JButton();
		bCopy.setText("Copy");
		bCopy.setBounds(20, 70, 70, 20);
		add(bCopy);
		bCopy.addActionListener(this);
		
		chList = new JCheckBox();
		chList.setText("Show_File_List");
		chList.setBounds(215,100, 120, 20);
		add(chList);
		chList.addActionListener(this);
		
		bPath = new JButton();
		bPath.setText("Set Acc Name");
		bPath.setBounds(215, 70, 120, 20);
		add(bPath);
		bPath.addActionListener(this);
		
		/*bSet= new JButton();
		bSet.setText("Set");
		bSet.setBounds( 100 , 70, 80, 20);
		add(bSet);
		bSet.addActionListener(this);
		*/
		
		bInstall = new JButton();
		bInstall.setText("Install/Open");
		bInstall.setBounds(100, 70, 110, 20);
		add(bInstall);
		bInstall.addActionListener(this);
		
		bAbout = new JButton();
		bAbout.setText("About");
		bAbout.setBounds(370, 100, 70, 20);
		add(bAbout);
		bAbout.addActionListener(this);
		
		bGroup = new JButton();
		bGroup.setText("All Cpy/Opn");
		bGroup.setBounds(340, 70, 100, 20);
		add(bGroup);
		bGroup.addActionListener(this);
		
		
		// pola text
		
		tPlace = new JTextField();
		tPlace.setText("C:\\" +"\\" + "Users" +"\\"+"\\"+"Your_ACC_name"+"\\" + "\\" + "Downloads");
		tPlace.setBounds(100, 20, 300, 20);
		add(tPlace);
		tPlace.setToolTipText("Example: D:\\"+"\\"+"directory_name"+"\\"+"\\"+"file.txt");
		
		tWhere = new JTextField();
		tWhere.setText("");
		tWhere.setBounds(100, 40, 300, 20);
		add(tWhere);
		tWhere.setToolTipText("Example: D:\\"+"\\"+"file.txt");
		
		tChoice = new JTextField();
		tChoice.setText(".extension");
		//tChoice.setBounds(190, 70, 80, 20); // rozmieszczenie kiedy przycisk Set jest aktywny
		tChoice.setBounds(20, 100, 80, 20);
		add(tChoice);
		tChoice.setToolTipText("Example .txt");
		
		tInstall = new JTextField();
		tInstall.setText("Instal file name");
		tInstall.setBounds(110, 100, 90, 20);
		add(tInstall);
		
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent x)  { 
		Object zrodlo = x.getSource();
		
		String memory = "";
		String memory1 = "";
		//String memory_path ="";
		
		
		String memoryTwhere="";
		
		
		Scanner saveEx;
		String memorson="";
		String allInstallPath="";
		String tInstallPath ="";
		String tOpenpath ="";
		String ex="";
		
		FileList list = new FileList();
		
		
		
		boolean retVal;
		
		if (zrodlo == bCopy)
		{	
			
			place = tPlace.getText();
			where = tWhere.getText();
			
			
			try {
				PrintWriter zapis_tWhere = new PrintWriter("tWhere.txt");
				Scanner skaner = new Scanner(where);
				
				while (skaner.hasNext())
					
				{
					
					zapis_tWhere.println(skaner.nextLine() ); // tutaj jest odstep w liscie //+ "\n"
					
					
				}
			
				skaner.close();
				zapis_tWhere.close();
				
			
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		
			
			Copy copy = new Copy();
			copy.cpy(place,where);
			JOptionPane.showMessageDialog(null,"Operation completed .","Message",JOptionPane.INFORMATION_MESSAGE);
			
		
			
			
			
		}
		
		else if (zrodlo == chList && chList.isSelected()== true)
		{	
			
			list.setDefaultCloseOperation(HIDE_ON_CLOSE);
			list.setVisible(true);
			list.setLocation(900,400);
			ex = tChoice.getText();
			File whereMemory = new File("tWhere.txt");
			try {
				Scanner czytaj = new Scanner(whereMemory);
				memoryTwhere = czytaj.nextLine();
				//System.out.println(memoryTwhere);

				czytaj.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tWhere.setText(memoryTwhere);
			
			try {
				FileReader fileReader1 = new FileReader("path.txt");
				BufferedReader bufferReader = new BufferedReader(fileReader1);
				String linia1=""; 
				while ((linia1 = bufferReader.readLine()) !=null) {
					System.out.println(linia1);
					memory_path = linia1;
				}
				fileReader1.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
			
			
			File katalog = new File("C:\\Users\\"+memory_path+"\\Downloads"); // Chce to zrobiæ dynamicznie edit: niby siê uda³o  
			String pliki[] = katalog.list();

			for(int i =0 ; i < pliki.length; i++)
			{
			 //System.out.println(pliki[i]); 
			
			 
			 memory += pliki[i];
			 memory += "\n";
			 
			
			
			try {
				PrintWriter zapis = new PrintWriter("files.txt");
				Scanner skaner = new Scanner(memory);
				
				while (skaner.hasNext())
					
				{
					
					zapis.println(skaner.nextLine() ); // tutaj jest odstep w liscie //+ "\n"
					
					
				}
			
				skaner.close();
				zapis.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
			}
			
			System.out.println("Przed"+memory_path);			
			tPlace.setText("C:\\" +"\\" + "Users" +"\\"+"\\"+memory_path+"\\" + "\\" + "Downloads"+ "\\" + "\\");
			System.out.println("Po"+memory_path);
		
			
			try {
				FileReader fileReader = new FileReader("files.txt");
				BufferedReader bufferReader = new BufferedReader(fileReader);
				
				String linia=""; 
				
				ArrayList<String> arList = new ArrayList<>();
				
				while ((linia = bufferReader.readLine()) !=null ) {
					memory1 += linia; 
					//retVal = memory1.endsWith(".package");
					retVal = memory1.endsWith(ex);
					memory1 += "\n";  
					
					if (retVal == true)
						{
							
							
							System.out.println(linia);
							System.out.println("MaM GO !");
							arList.add(linia);
							
						}
					else 
						{
							System.out.println("nie mam");
						}
					
				}
				fileReader.close();	
				System.out.println("Pusto"+memory_path);
				System.out.println("----------------------------------------- WYNIK ----------------------------\n\n");
				String tmpString = "";
				for(String tmp : arList)
				{
					System.out.println(tmp);
					tmpString += (tmp + "\n");
					
				}
				list.tList.setText(tmpString);
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		// Chce zrobiæ wylacznie sie 
		else if (zrodlo == chList && chList.isSelected()== false )
		{
		    
			list.setDefaultCloseOperation(HIDE_ON_CLOSE);
			list.setVisible(false);
			list.setLocation(900,400);
			
			System.out.println("huhu");
		}
		else if(zrodlo == bPath)
		{
			SetPath path = new SetPath();
			path.setDefaultCloseOperation(HIDE_ON_CLOSE);
			path.setVisible(true);
			path.setLocation(500, 400);
			
		}
		
	
		else if(zrodlo == bInstall)
		{
		 
		  tInstallPath = tPlace.getText();
		  tOpenpath = tInstall.getText();
		  String tChoseAll = tChoice.getText();
		  
		  
		  boolean retValInstallExe,retValInstallTxt;
		  retValInstallExe = tOpenpath.endsWith(".exe");
		  retValInstallTxt = tOpenpath.endsWith(".txt");
		
		  if(retValInstallExe == true)
		  {   
		     System.out.println(tChoseAll);
	                try {
	                     allInstallPath = tInstallPath + tOpenpath;
	                  //  Runtime.getRuntime().exec ("D:\\oko.txt");
	                    Runtime r = Runtime.getRuntime();
	                    Process p = r.exec(allInstallPath);
	                } catch (IOException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	          } else if(retValInstallTxt== true )
	          {
	              try {
                      Runtime rTxt = Runtime.getRuntime();
                      Process pTxt = rTxt.exec("C:\\Windows\\System32\\notepad.exe"+" "+"C:\\Users\\"+""+memory_path+""+"\\Downloads\\"+ tOpenpath);// Zrobione !
                     // Process pTxt = rTxt.exec("C:\\Windows\\System32\\notepad.exe C:\\Users\\Przemon\\Downloads\\oko.txt");
               } catch (IOException e) {
                   // TODO Auto-generated catch block
                   e.printStackTrace();
               }
	          }
	          else  
	          { 
	                
	              System.out.println("Nie prawidlowe rozszerzenie");
	              JOptionPane.showMessageDialog(null,"Operation failed not supported extension.","Message",JOptionPane.WARNING_MESSAGE);
	          
	          }
		}
		else if(zrodlo == bAbout)
		{
		    About a = new About();
		    a.setDefaultCloseOperation(HIDE_ON_CLOSE);
	        a.setVisible(true);
	        //sims.setLocation(500,400);
	        a.setLocationRelativeTo(null);
		}
		else if (zrodlo == bGroup) // zrobic grupowe kopiowanie
		{
		    AllCpyOp acOp = new AllCpyOp();
		    acOp.AllCpy();
		}
		
		  
		 
		  
	
		
	}
	
}
	
