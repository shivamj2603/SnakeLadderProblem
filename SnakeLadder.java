public class SnakeLadder {

		public static void main(String[] args)
		{      


                       //constants
                       final int NO_PLAY=0;
		       final int LADDER=1;
		       final int SNAKE=2;   
                        

                       //variables
		       int position=0;
		       int countOfDieRoll=0;
                       int die=0;
                       int option=0;

                       do{

                         die = (int) ( Math.floor(Math.random()*6) + 1);
                         countOfDieRoll++;
                         option=(int) Math.floor(Math.random()*3);
		            switch(option) {
		                
		                case NO_PLAY:
		                break;
		                
		                case LADDER:
		                position=position + die;
                                if(position>100)
		                {
		                    position=position-die;
		                }
		                break;
		                
		                case SNAKE:
		                position=position - die;
                                if(position<0)
		                {
		                    position=0;
		                }
                                break;
                            
                            }

                            System.out.println("Position:" + position);

                        }while(position!=100); 

                       System.out.println("Number of times the dice was rolled:" + countOfDieRoll);

             
		}

}