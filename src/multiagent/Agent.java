package multiagent;

import java.util.ArrayList;
import java.util.Hashtable;

import multiagent.LetterBox;

public class Agent implements Runnable
{
	private static Hashtable<Integer, Agent> allAgents = new Hashtable<>(Constants.NB_AGENTS);
	
	private static int LASTID = -1;
	public final int ID;

	private int currentX;
	private int currentY;

	private int goalX;
	private int goalY;

	private ArrayList<Message> messages;
	private LetterBox letterBox;

	public Agent(int currentX, int currentY, int goalX, int goalY)
	{
		ID = ++LASTID;
		this.currentX = currentX;
		this.currentY = currentY;
		this.goalX = goalX;
		this.goalY = goalY;

		letterBox = LetterBox.getInstance();
		
		allAgents.put(ID, this);
	}

	@Override
	public void run()
	{
		// Boucle principal
		while (currentX != goalX & currentY != goalY)
		{
			messages = letterBox.getMessages(ID);
			letterBox.deleteMessages(ID);
			
			//Traitement des messages
			
			//Mise a jour des coords
			
			//Envoi de messages
		}
	}

	public boolean atGoal(){
		return (currentX == goalX) && (currentY == goalY);
	}
	
	public int getCurrentX() {
		return currentX;
	}

	public int getCurrentY() {
		return currentY;
	}

	public int getGoalX() {
		return goalX;
	}

	public int getGoalY() {
		return goalY;
	}
}
