package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * this class is to read common data from properties file
 * @author Anupama A R
 */

public class PropertiesUtility 
{
/**
 * this is a generic method to use common data 
 * @param data
 * @return
 * @throws Exception
 */
public String getDataFromProperties(String data) throws Exception
{
	FileInputStream fis = new FileInputStream(IconstantUtility.propertiesPath);
	Properties pobj = new Properties();
	pobj.load(fis);
	String propertiesData = pobj.getProperty(data);
	
	return propertiesData;
	
}


}
