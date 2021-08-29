package entities;

public class ScoreCalculatorType {

	private int id;
	private String name;
	private double rate;
	
	public ScoreCalculatorType() {
		super();
	}

	public ScoreCalculatorType(int id, String name, double rate) {
		super();
		this.id = id;
		this.name = name;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
