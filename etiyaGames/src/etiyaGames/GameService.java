package etiyaGames;

import java.util.ArrayList;
import java.util.List;

public class GameService {
	
	ArrayList<Game> games=new ArrayList<Game>();
	
	public void add(Game game) {
		System.out.println("Oyun eklendi : "+ game.getGameName());
		games.add(game);
	}
	
	public List<Game> getGames() {
		
		return games;
	}

}
