package algomaster_lld.snakeandladdergame;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		//create players
		List<String> players = Arrays.asList("Alice", "Bob", "Charlie");
		
		//create board
		List<BoardEntity> boardEntities = List.of(
				new Snake(17,7), new Snake(54,34),
				new Snake(62,19), new Snake(98,79),
				new Ladder(3,38),new Ladder(24,33),
				new Ladder(42,93), new Ladder(72,84)
				);
		
		Game game = new Game.Builder().setBoard(100,boardEntities)
				.setPlayers(players)
				.setDice(new Dice(1,6)).build();
		game.play();
		//create dice
		//create snake and ladder in board
		
		
	}

}
