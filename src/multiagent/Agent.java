package multiagent;

import java.util.ArrayList;
import multiagent.LetterBox;

public class Agent implements Runnable
{
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
	}

	@Override
	public void run() {
		//Boucle principal
		//TODO changer en while(puzzle non terminé)
		while(currentX != goalX & currentY != goalY){
			messages = letterBox.getMessages(ID);
			letterBox.deleteMessages(ID);
			
			//Lecture des messages
		}
	}
}
