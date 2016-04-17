package myMethod;


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy {

	public void cpy(String souruce, String target){
			
		
		Path source1 = Paths.get(souruce);
		Path target1 = Paths.get(target);

		
		try {
		Files.copy(source1, target1, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
		Files.delete(source1);
		} catch (IOException e) {
		e.printStackTrace();
		}

	}
	
}