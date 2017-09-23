package KeywordDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropObject
{
	  Properties p = new Properties();
	    public Properties PropGetRepository() throws IOException{
	        //Read object repository file
	        InputStream stream = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\KeywordDrivenTest\\object.properties"));
	        //load all objects
	        p.load(stream);
	         return p;
	    }
	   

}
