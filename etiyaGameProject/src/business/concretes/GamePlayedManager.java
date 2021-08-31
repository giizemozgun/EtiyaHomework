package business.concretes;

import java.util.List;

import business.abstracts.GamePlayedService;
import dataAccess.abstracts.GamePlayedDao;
import entities.concretes.GamePlayed;


public class GamePlayedManager implements GamePlayedService {
	
	GamePlayedDao gamePlayedDao;

	

	public GamePlayedManager(GamePlayedDao gamePlayedDao) {
		super();
		this.gamePlayedDao = gamePlayedDao;
	}

	@Override
	public void add(GamePlayed gamePlayed) {
		this.printGameScore(gamePlayed);
		this.gamePlayedDao.add(gamePlayed);
	}

	@Override
	public List<GamePlayed> getAll() {
		System.out.println("Listelendi");
		 return this.gamePlayedDao.getAll();

	}

	@Override
	public void update(GamePlayed gamePlayed) {
		
		System.out.println("Güncellendi");
		this.gamePlayedDao.update(gamePlayed);
	}

	@Override
	public void delete(GamePlayed gamePlayed) {
		System.out.println("Silindi");
		this.gamePlayedDao.delete(gamePlayed);

	}
	
	public double calculateGameScore(GamePlayed gamePlayed) {
		
		double gameScore = gamePlayed.getGamer().getGameScore() * (gamePlayed.getScoreCalculatorType().getRate())/100;
		return gameScore ;
	}
	
	public void printGameScore(GamePlayed gamePlayed) {
		System.out.println("Oynanan oyun : " + gamePlayed.getGame().getName() + " Oynayan oyuncu : "
				+ gamePlayed.getGamer().getFirstName() + 
				" Oyuncu puanı : " + gamePlayed.getGamer().getGameScore()+ 
				" Hesaplanan Puan " + this.calculateGameScore(gamePlayed));
	}
	
}
