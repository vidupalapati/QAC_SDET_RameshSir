package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenericMethods 
{
	public String getProperties(String Location,String Property) throws IOException
	{
		Properties loadfile = new Properties();
		FileInputStream fis = new FileInputStream(Location);
		loadfile.load(fis);
		
		String property = loadfile.getProperty(Property);
		return property;
	}

}
