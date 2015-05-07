package multiagent;

import java.util.ArrayList;
import java.util.Hashtable;

public class LetterBox {

	private static LetterBox instance;
	
	private Hashtable<Integer, ArrayList<Message>> letterBox;

	private LetterBox(int numberOfAgents) {
		letterBox = new Hashtable<Integer, ArrayList<Message>>();
		for(int i=0; i<numberOfAgents; i++){
			letterBox.put(i, new ArrayList<Message>());
		}
	}
	
	public static LetterBox getInstance(){
		if(instance == null){
			instance = new LetterBox(Constants.NB_AGENTS);
		}
		return instance;
	}
	
	public void putMessage(int destination, Message message){
		letterBox.get(destination).add(message);
	}
	
	public ArrayList<Message> getMessages(int agent){
		return letterBox.get(agent);
	}
	
	public void deleteMessages(int agent){
		letterBox.put(agent, new ArrayList<Message>());
	}
}
