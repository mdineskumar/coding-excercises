package algomaster_lld.snakeandladdergame;

public class Ladder extends BoardEntity {

	public Ladder(int start, int end) {
		super(start, end);
		if(start >= end) {
			throw new IllegalArgumentException("Ladder bottom must be at lower position than its top.");
		}
	}
	
}
