import java.util.Random;

public class Player2 extends Player {
		
	
	
	@Override
	public Roshambo generateRashambo() {
 
        int randNum = (int) Math.random() * 3; 
        
        switch (randNum) {
        case 0:
            return Roshambo.ROCK;    
                                    
        case 1:
            return Roshambo.PAPER;
        case 2:
            return Roshambo.SCISSOR;
        default:
            return null;
        }
    }
}

