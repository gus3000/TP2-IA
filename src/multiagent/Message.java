package multiagent;

public class Message
{
	private int sender, reciever;
	
	private int XtoLiberate;
	private int YtoLiberate;
	
	public Message(int sender, int reciever, int x, int y){
		this.sender = sender;
		this.reciever = reciever;
		this.XtoLiberate = x;
		this.YtoLiberate = y;
	}

	public int getSender() {
		return sender;
	}

	public int getReciever() {
		return reciever;
	}

	public int getXtoLiberate() {
		return XtoLiberate;
	}

	public int getYtoLiberate() {
		return YtoLiberate;
	}
	
}
