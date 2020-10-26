package dmacc.beans;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

//The Data annotation is a call to lombok which takes care of the
//getters, setters, constructors, and other methods that come with beans
@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	
	//special constructor
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}
	
	public String setComputerPlayerToRandom() {
		String[] choices ={"rock", "paper", "scissors"};
		
		Random choice = new Random();
		
		int randomIndex = choice.nextInt(choices.length);
		
		return choices[randomIndex];
	}
	
	public String determineWinner()
	{
		String winner ="";
		if (this.player1 == this.setComputerPlayerToRandom())
		{
			winner = "draw";
		}
		else if (this.player1.contains("rock") && this.setComputerPlayerToRandom().contentEquals("scissors"))
		{
			winner = "player";
		}
		else if (this.player1.contains("paper") && this.setComputerPlayerToRandom().contentEquals("rock"))
		{
			winner = "player";
		}
		else if (this.player1.contains("scissors") && this.setComputerPlayerToRandom().contentEquals("paper"))
		{
			winner = "player";
		}
		else
		{
			winner = "Computer";
		}
		
		
		return winner;
	}
}
