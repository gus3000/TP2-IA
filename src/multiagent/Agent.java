package multiagent;

public class Agent
{
	private static int LASTID = -1;
	public final int ID;

	public Agent()
	{
		ID = ++LASTID;
	}
}
