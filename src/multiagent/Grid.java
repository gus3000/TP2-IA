package multiagent;

public class Grid
{
	private static Grid instance = null;
	
	private static final int WIDTH = 5;
	private static final int HEIGHT = 5;
	
	
	private Grid()
	{
		
	}
	
	public Grid getInstance()
	{
		if(instance == null)
			instance = new Grid();
		return instance;
	}
}
