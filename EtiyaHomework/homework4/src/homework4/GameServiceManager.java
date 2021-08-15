package homework4;

public interface GameServiceManager {
	
	void update(Game game);
	void delete(Game game);
	void add(Game game, Gamer gamer, Campaign campaign);
}
