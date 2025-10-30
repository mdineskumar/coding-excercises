package algomaster_lld.snakeandladdergame;

public class Player {
	private final String name;
	private int position;
	
	public Player(String name) {
		this.name = name;
		this.position = 0;
	}
	
	public String getName() {
		return this.name;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	public int getPosition() {
		return this.position;
	}	
}
