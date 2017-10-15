
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerBalanceLimitTest {
    
    Player player;
    int bet;
    int limit;
    
    @Before
    public void setUp() {
        player = new Player("Joe", 5);
        bet = 5;
        limit = 0;
    }
    
    @After
    public void tearDown() {
        player = null;
        bet = 0;
    }
    
    @Test
    public void testPlayerBalanceLimit() {
        System.out.println("User Current Balance: " + player.getBalance());
        System.out.println("User Bet is: " + bet);
        assertTrue(player.balanceExceedsLimitBy(bet));
        
    }

}
