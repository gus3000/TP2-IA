package multiagent;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Constants
{
	private static Constants ap = new Constants();
	private static Properties p = ap.prop;
	
	public final static int WIDTH = Integer.parseInt(p.getProperty("width"));
	public final static int HEIGHT = Integer.parseInt(p.getProperty("height"));
	public final static int NB_AGENTS = Integer.parseInt(p.getProperty("nbagents"));
	
	private Properties prop;
	
	public Constants()
	{
		prop = new Properties();
		String propFileName = "system.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		
		if(inputStream != null)
		{
			try
			{
				prop.load(inputStream);
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
