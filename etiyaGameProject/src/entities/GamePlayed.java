package entities;

public class GamePlayed {
	private int id;
	private Gamer gamer;
	private Game game;
	private ScoreCalculatorType scoreRate;
	
	public GamePlayed(int id, Gamer gamer, Game game, ScoreCalculatorType scoreRate) {
		super();
		this.id = id;
		this.gamer = gamer;
		this.game = game;
		this.scoreRate = scoreRate;
	}
	public GamePlayed() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Gamer getGamer() {
		return gamer;
	}
	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public ScoreCalculatorType getScoreRate() {
		return scoreRate;
	}
	public void setScoreRate(ScoreCalculatorType scoreRate) {
		this.scoreRate = scoreRate;
	}
	
}
