import org.junit.Test;
import static org.junit.Assert.*;

public class SpadeNotSelectedTest {
    String currentSymbol;
    @Test
    public void testIfSpadeIsSelected() {
        String expectedSymbolName = "SPADE";
        for(int i=0; i < 10; i++) {
            currentSymbol = DiceValue.getRandom().toString();
            if(currentSymbol.equals(expectedSymbolName)) break;
            System.out.println(DiceValue.getRandom().toString());
        }
        assertEquals(expectedSymbolName,currentSymbol);
        
    }
}
