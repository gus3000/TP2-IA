package multiagent;

import java.util.ArrayList;
import java.util.HashMap;

public class LetterBox {

	HashMap<Integer, ArrayList<Message>> letterBox;

	public LetterBox(int numberOfAgents) {
		for(int i=0; i<numberOfAgents; i++){
			letterBox.put(i, new ArrayList<Message>());
		}
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
