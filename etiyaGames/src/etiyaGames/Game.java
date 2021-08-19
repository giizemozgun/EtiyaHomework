package etiyaGames;

public class Game {
String gameName;
int gamePrice;


public Game() {
	super();
}
public Game(String gameName, int gamePrice) {
	super();
	this.gameName = gameName;
	this.gamePrice = gamePrice;
	
}

public String getGameName() {
	return gameName;
}
public void setGameName(String gameName) {
	this.gameName = gameName;
}
public int getGamePrice() {
	return gamePrice;
}
public void setGamePrice(int gamePrice) {
	this.gamePrice = gamePrice;
}

@Override
public String toString() {
	return "Game [gameName=" + gameName + ", gamePrice=" + gamePrice + "]";
}


}
