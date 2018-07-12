package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerhealth=100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonhealth=100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerattack=5;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonattack=10;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerhealth>0 && dragonhealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String A1=JOptionPane.showInputDialog("do you want to attack with a kick or a yell?");		
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			Random hit=new Random();
			int value=hit.nextInt(10);
			//-- Subtract that number from the dragon's health variable 
			dragonhealth-=value;
		// 10. If they typed in "kick":
			Random kick=new Random();
			int number=kick.nextInt(25);
		if(A1.equals("kick")){dragonhealth=dragonhealth-number;}
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		Random strike=new Random();
		int number2=strike.nextInt(35);
		// 12. Subtract this number from the player's health
		
		playerhealth=playerhealth-number2;
		
		// 13. If the user's health is less than or equal to 0
		if(playerhealth<=0){JOptionPane.showMessageDialog(null, "You lose");}
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		else if (dragonhealth<=0) {JOptionPane.showMessageDialog(null, "the dragon is dead and you took a ton of gold");
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
		{	JOptionPane.showMessageDialog(null, "Dragon's Health is "+dragonhealth+". Your health is "+playerhealth);
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		}
		}
	}
}
}