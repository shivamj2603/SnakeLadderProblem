public class SnakeLadder {
	static boolean turndecider=true;
	public static int playDice (int position,String Player)
	{
		//constants
		final int NO_PLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;  
		//variables
		int  die = (int) (Math.floor(Math.random() * 6) + 1);
		int option = (int) Math.floor(Math.random() * 3);
		switch(option) {
		case NO_PLAY:
			break;
		case LADDER:
			position=position + die;
			if(position > 100)
			{
				position=position - die;
			}
			if(position != 100) {
				playDice (position,Player);
			}
			break;
		case SNAKE:
			position = position - die;
			if(position < 0)
			{
				position = 0;
			}
			break;
		}
		System.out.println("Position of "+ Player +" "+ position);
		return position;
	}
	public static void main(String[] args)
	{
		int positionOfP1 = 0;
		int positionOfP2 = 0;
		while(positionOfP1 < 100 && positionOfP2 < 100) {
			if(turndecider) {
				positionOfP1 = playDice(positionOfP1,"Player1");
			}
			else
			{
				positionOfP2 = playDice(positionOfP2,"Player2");
			}
			turndecider =! turndecider;
		}
		if(positionOfP1 == 100)
		{
			System.out.println("Player1 wins");
		}
		else
		{
			System.out.println("Player2 wins");
		}
	}

}

