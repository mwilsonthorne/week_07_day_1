import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestVisitor {

    Visitor child;
    Visitor adult;
    Playground playground;
    TobaccoStall tobacco;
    RollerCoaster rollerCoaster;
    Dodgems dodgems;


    @Before
    public void before(){
        adult = new Visitor(39, 183, 100);
        child= new Visitor(5,90,5);
        playground = new Playground("Kids Area", 3);
        tobacco = new TobaccoStall("Tabac", "Pierre", 1, 1);
        rollerCoaster = new RollerCoaster("Coca Roller", 5);
        dodgems = new Dodgems("Mental Dodge", 4);


    }

    @Test
    public void getAge(){
        assertEquals(39, adult.getAge());
    }

    @Test
    public void getHeight(){
        assertEquals(183, adult.getHeight());
    }

    @Test
    public void getMoney(){
        assertEquals(100, adult.getMoney());
    }

    @Test
    public void testAgeRestrictionOnPlayground(){
        assertEquals(true, playground.isAllowedTo(child));
    }

    @Test
    public void testAgeRestrictionOnTobacco(){
        assertEquals(true, tobacco.isAllowedTo(adult));
    }

    @Test
    public void testRestrictionOnOnRollerCoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(adult));
    }

    @Test
    public void testChildrenGetHalfPriceOnDodgems(){
        assertEquals(5.50, dodgems.priceFor(child), 0.1);
    }

    @Test
    public void testChildrenGetHalfPriceOnRollerCoaster(){
        assertEquals(7.50, rollerCoaster.priceFor(child), 0.1);
    }

    @Test
    public void testAllStallPrice(){
        assertEquals(20, tobacco.priceFor(adult), 0.1);
    }
}
