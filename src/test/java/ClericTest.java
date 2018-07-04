import Character.Instances.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ClericTest {

    Cleric cleric1;
    Cleric cleric2;

    @Before
    public void before(){
        cleric1 = new Cleric("Healer Henry", 5, false, 10);
        cleric2 = new Cleric("Healer Harold", 5, false, 10);
    }


    @Test
    public void heal() {
    }

    @Test
    public void getHealth() {
        assertEquals(5, cleric1.getHealth());
    }

    @Test
    public void reduceHealth() {
        cleric1.reduceHealth(5);
        assertEquals(0, cleric1.getHealth());
    }

    @Test
    public void increaseHealth() {
        cleric1.increaseHealth(5);
        assertEquals(10, cleric1.getHealth());
    }

    @Test
    public void isEnemy() {
        assertFalse(cleric1.isEnemy());
    }

    @Test
    public void getWallet() {
        assertEquals(10, cleric1.getWallet());
    }

    @Test
    public void pay() {
        cleric1.pay(5);
        assertEquals(5, cleric1.getWallet());
    }

    @Test
    public void receiveMoney() {
        cleric1.receiveMoney(5);
        assertEquals(15, cleric1.getWallet());
    }

    @Test
    public void getName() {
        assertEquals("Healer Henry", cleric1.getName());
    }
}
