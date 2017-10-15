import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class IncorrectPayoutTests {    
    
    Dice dice1;
    Dice dice2;
    Dice dice3;
    Player player;
    int bet;
    int expectedWinningAmount;
    int currentBalance;
    int expectedBalance;
    
    Game game;
    
    @Before
    public void setUp() {
        dice1 = new Dice();
        dice2 = new Dice();
        dice3 = new Dice();
        player = new Player("Joe", 100);
        bet = 10;
        game = new Game(dice1, dice2, dice3);
        currentBalance = player.getBalance();
        expectedBalance = 0;
        
    }
    
    @After
    public void tearDown() {
        dice1 = null;
        dice2 = null;
        dice3 = null;
        game= null;
        player = null;
        expectedWinningAmount = 0;
        expectedBalance = 0;
        currentBalance = 0;
    }
    
    @Test 
    public void testWinningForNoMatch() {
      int winning = game.playRound(player, DiceValue.CLUB, bet);
      printSelectSymbols("In Zero Match Method");
      expectedWinningAmount = bet * 0;
      assertEquals(expectedWinningAmount, winning);
    }
    
    @Test 
    public void testWinningForOneMatch() {
      expectedBalance = currentBalance + (bet * 1);
      int winning = game.playRound(player, DiceValue.CLUB, bet);
      printSelectSymbols("In One matched method");
      expectedWinningAmount = bet * 1;
      System.out.println("The balance should be " + expectedBalance + " but is " + player.getBalance());
      assertEquals(expectedWinningAmount, winning);
      assertEquals(expectedBalance, player.getBalance());
     
    }
    
    @Test 
    public void testWinningForTwoMatch() {
      expectedBalance = currentBalance + (bet * 2);
      int winning = game.playRound(player, DiceValue.CLUB, bet);
      printSelectSymbols("In Two matched method");
      expectedWinningAmount = bet * 2;
      System.out.println("The balance should be " + expectedBalance + " but is " + player.getBalance());
      assertEquals(expectedWinningAmount, winning);
      assertEquals(expectedBalance, player.getBalance());
     
    }
    
    @Test 
    public void testWinningForAllMatch() {
      expectedBalance = currentBalance + (bet * 3);
      int winning = game.playRound(player, DiceValue.CLUB, bet);
      printSelectSymbols("In All matched method");
      expectedWinningAmount = bet * 3;
      System.out.println("The balance should be " + expectedBalance + " but is " + player.getBalance());
      assertEquals(expectedWinningAmount, winning);
      assertEquals(expectedBalance, player.getBalance());
     
    }
    
    
    
    public void printSelectSymbols(String matchName) {
        List<DiceValue> diceValues = game.getDiceValues();
        
        System.out.println("");
        System.out.println("---------- Start " + matchName + "! ------------");
        
        for (DiceValue dv : diceValues) {
            System.out.println(dv.toString());
        }
        System.out.println("------- End " + matchName + "! -----------");
        System.out.println("");
    }
}
