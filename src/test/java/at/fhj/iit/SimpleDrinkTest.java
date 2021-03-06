package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * This class tests the class SimpleDrink
 */

@DisplayName("Testing SimpleDrink implementation")

public class SimpleDrinkTest {
    private SimpleDrink sW, sB;
    /**
     * inits an alcoholic and nonalcoholic SimpleDrink for EACH test
     */
    @Test
    @BeforeEach
    void setup() {
        // SETUP PHASE
        sW = new SimpleDrink("Water",new Liquid("Water",1.0,0));
        sB = new SimpleDrink("Gösser",new Liquid("Beer",0.5,5));
    }
    /**
     * Tests the constructor of an alcoholic SimpleDrink
     */
    @Test
    @DisplayName("Testing constructor alcohol")
    public void testConstructorAlcohol(){
        assertEquals(sB.getVolume(),0.5,0.001);
        assertEquals(sB.getAlcoholPercent(),5);
        assertEquals(sB.getName(),"Gösser");
    }
    /**
     * Tests the constructor of an non alcoholic SimpleDrink
     */
    @Test
    @DisplayName("Testing constructor non alcohol")
    public void testConstructorNonAlcohol(){
        assertEquals(sW.getVolume(),1.0,0.001);
        assertEquals(sW.getAlcoholPercent(),0);
        assertEquals(sW.getName(),"Water");
    }
    /**
     * Tests the isAlcoholic method of a SimpleDrink
     */
    @Test
    @DisplayName("Testing isAlcoholic method")
    public void testIsAlcoholic(){
        assertEquals(sW.isAlcoholic(), false);
        assertEquals(sB.isAlcoholic(), true);
    }

}
