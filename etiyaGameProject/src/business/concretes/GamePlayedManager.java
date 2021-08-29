package business.concretes;

import business.abstracts.GamePlayedService;
import entities.GamePlayed;


public class GamePlayedManager implements GamePlayedService {


	@Override
	public void add(GamePlayed gamePlayed) {
		this.printGameScore(gamePlayed);
	}

	@Override
	public void getAll() {
		System.out.println("Listelendi");

	}

	@Override
	public void update(GamePlayed gamePlayed) {
		
		System.out.println("Güncellendi");
	}

	@Override
	public void delete(GamePlayed gamePlayed) {
		System.out.println("Silindi");

	}
	
	public double calculateGameScore(GamePlayed gamePlayed) {
		
		double gameScore = gamePlayed.getGamer().getGameScore() * (gamePlayed.getScoreRate().getRate())/100;
		return gameScore ;
	}
	
	public void printGameScore(GamePlayed gamePlayed) {
		System.out.println("Oynanan oyun : " + gamePlayed.getGame().getName() + " Oynayan oyuncu : "
				+ gamePlayed.getGamer().getFirstName() + 
				" Oyuncu puanı : " + gamePlayed.getGamer().getGameScore()+ 
				" Hesaplanan Puan " + this.calculateGameScore(gamePlayed));
	}
	
}
