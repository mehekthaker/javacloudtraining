//Create interface "Game" have an abstract method "play()" from this interface define "Cricket",
//"FootBall", "Tennis". Now define one more class Demo.
//In this class have a method "perform" which will take interface reference as parameter inside
//"perform" see to it that any child object passed, its play() method should be invoked.
public class Demo {
	
	public static void perform(Game game)
	{
		game.play();
	}

	public static void main(String args[]) 
	{
		Game game[] = new Game[3];
		game[0] = new Cricket();
		game[1] = new Tennis();
		game[2] = new FootBall();
		
		for(int i=0; i<3; i++)
		{
			game[i].play();
		}
	}
	
}
