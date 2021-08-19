package etiyaGames;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game("Lol",150);
		Game game2 = new Game("Pubg",200);
       
        Game game3 = new Game("Cs",100);
        Game game4 = new Game("Valorant",170);
        
        Game game5 = new Game("Portal",150);
        Game game6 = new Game("Half-life",90);
        
        ArrayList<Game> strategyGames = new ArrayList<Game>();
        strategyGames.add(game1);
        strategyGames.add(game2);
        
        
        ArrayList<Game> fpsGames = new ArrayList<Game>();
        fpsGames.add(game3);
        fpsGames.add(game4);
        
		ArrayList<Game> fictionGames = new ArrayList<Game>();
		fictionGames.add(game5);
		fictionGames.add(game6);
		
		
		GameCategory category1 = new GameCategory(1, "Strateji Oyunu",strategyGames);
		GameCategory category2 = new GameCategory(2, "Fps Oyunu",fpsGames);
		GameCategory category3 = new GameCategory(3, "Kurgu Oyunu",fictionGames);
        

		
		ArrayList<GameCategory> categories = new ArrayList<GameCategory>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        
        for (GameCategory category : categories) {
            System.out.println(category);
        }
        System.out.println("--------------------------");
        
		
		UserService userService = new UserService();
		
		User user1=new User("Gizem","Özgün",23);
		User user2=new User("Gülsüm","Ceylan",23);
		User user3=new User("Eren","Aydın",25);
		
		userService.add(user1);
		userService.add(user2);
		userService.add(user3);
		
		for(User user : userService.users ) {
			System.out.println(user.getFirstName());
		}
		
	}
}

