package MojeMetody;

import java.util.ArrayList;



public class AllCpyOp {
    
    
    ArrayList<String> fileList = new ArrayList<>();
    String memory="";
    String memory1="";
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
        String place,where;
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
    
}
