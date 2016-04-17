package MojeMetody;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;

import javax.swing.JOptionPane;





public class AllCpyOp {
    
    
    ArrayList<String> fileList = new ArrayList<>();
    
    String memory="";
    String memory1="";
    String place,where;
    
    String temp1="";
    boolean retVal;
    String all_think="";
    String all_think2="";

    
    public void read_all(String temp_ex,String pathPlace, String pathWhere) throws IOException
    {   
        
        Copy copy = new Copy();
        place = pathPlace;
        where = pathWhere;
        System.out.println(place+where);
        int n=0;
        
        

        
        try {
          FileReader reader = new FileReader("files.txt");
          BufferedReader buf = new BufferedReader(reader);
          String linia="";
          System.out.println("Wynik allcp --------------------------");
          while((linia = buf.readLine()) != null)
                  { 
                      temp1 += linia;
                      retVal = temp1.endsWith(temp_ex);
                      temp1 +="\n";
                      if(retVal == true) {
                          all_think=place+linia;
                          all_think2=where+linia;
                          System.out.println(linia);
                          System.out.println("mam GOOO");
                          copy.cpy(all_think, all_think2);
                          n++;
                          
                          
                          
                      }
                      else
                      {
                          System.out.println("Nie mam");
                      }
                  
                      
                      
              
                  
                      
                  }
          
          JOptionPane.showMessageDialog(null, "Operation done!"+" Copy:"+n+"files" , "Done!" ,JOptionPane.INFORMATION_MESSAGE);
         reader.close(); 
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        
    }
    
    
 /*   
    public void add_arList_files(String arListFiles)
    {   
       
     
       //ArrayList<String> fileList = new ArrayList<>();
       String files;
       files = arListFiles;
       memory += files;
       fileList.add(memory); 
       System.out.println("dodalem");
       
       
       
       
       
       
 
      
       
     
   
          
        //System.out.println(place + where + files);
       //System.out.println(place + where + files);
    }
    
    public void add_path(String pathWhere, String pathPlace)
    {  
        place = pathPlace;
        where = pathWhere;
        System.out.println(place+where);
    }
    
    public void show_files() 
    {  
        
        for(String tmp:fileList)
        {
            memory1+=(tmp+"\n");
        }
    
        
         System.out.println("Wynik----------------------------------------------------------------------------");
         System.out.println(memory1);
         
         
      
        
        
        
        
   
      
              
         
         
         
         
        
         
    }
    */
}
