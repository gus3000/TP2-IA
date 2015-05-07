package multiagent;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Grid
{
	private static Grid instance = null;

	int grid[][];

	private Grid()
	{
		grid = new int[Constants.WIDTH][Constants.HEIGHT];
	}
	
	public void addAgent(Agent a)
	{
		grid[a.getCurrentX()][a.getCurrentY()] = a.ID;
	}

	public boolean isWinState()
	{
		return false; // PHOQUE YOU
	}

	public Grid getInstance()
	{
		if (instance == null)
		{
			instance = new Grid();

		}
		return instance;
	}
}
