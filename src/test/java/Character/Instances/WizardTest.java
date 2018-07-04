package Character.Instances;

import Items.Instances.Fire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    private Wizard wizard;
    private Wizard wizard2;
    private Fire fire;

    @Before
    public void setUp() {
        wizard = new Wizard("Merlin", 20, 30, false, 40);
        wizard2 = new Wizard("Merlin", 20, 30, true, 40);
        fire = new Fire("Fire", 7, 5);
    }

//    @Test
//    public void cast() {
//    }

    @Test
    public void remainingMagic() {
        assertEquals(30, wizard.remainingMagic());
    }

//    @Test
//    public void replenishMagic() {
//    }

    @Test
    public void getHealth() {
        assertEquals(20, wizard.getHealth());
    }

//    @Test
//    public void reduceHealth() {
//    }
//
//    @Test
//    public void increaseHealth() {
//    }

    @Test
    public void isEnemy() {
        assertFalse(wizard.isEnemy());
    }

    @Test
    public void getWallet() {
        assertEquals(40, wizard.getWallet());
    }

//    @Test
//    public void pay() {
//    }
//
//    @Test
//    public void receiveMoney() {
//    }

    @Test
    public void getName() {
        assertEquals("Merlin", wizard.getName());
    }
}