
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IncorrectDiceValueOutputTest {
    
    Dice dice; 
    Dice dice2;
    Dice dice3;
    
    Game game;
    
    @Before
    public void setUp() {
        dice = new Dice();
    }
    
    @After
    public void tearDown() {
        dice = null;
    }
    
    @Test
    public void testDiceValueUpdate() {
        for(int i = 0; i <= 10;  i++) {
            dice.roll();
            System.out.println(dice.getValue());
            
        }
    }
    
}