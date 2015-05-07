package multiagent;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Grid
{
	private static Grid instance = null;
	
	
	private Grid() throws IOException
	{
		Properties prop = new Properties();
		String propFileName = "system.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		
		if(inputStream != null)
		{
			prop.load(inputStream);
		}
	}
	
	public Grid getInstance()
	{
		if(instance == null)
		{
			try
			{
				instance = new Grid();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return instance;
	}
}
