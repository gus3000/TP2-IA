package multiagent;

public class Agent
{
	private static int LASTID = -1;
	public final int ID;

	private int currentX;
	private int currentY;

	private int goalX;
	private int goalY;

	public Agent(int currentX, int currentY, int goalX, int goalY)
	{
		ID = ++LASTID;
		this.currentX = currentX;
		this.currentY = currentY;
		this.goalX = goalX;
		this.goalY = goalY;
	}

}
