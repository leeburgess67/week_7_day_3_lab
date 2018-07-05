package Character.Instances;

import Items.Instances.Fire;
import Items.Instances.Poison;
import Items.Instances.Potion;
import Items.ItemType.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    private Wizard wizard;
    private Wizard wizard2;
    private Fire fire;
    private Poison poison;

    @Before
    public void setUp() {
        wizard = new Wizard("Merlin", 20, 30, false, 40);
        wizard2 = new Wizard("Merlin", 20, 30, true, 40);
        fire = new Fire("Fire", 7, 5);
        poison = new Poison("Potion", 5, 5);
    }

    @Test
    public void cast() {
        wizard.cast(fire, wizard2);
        assertEquals(13, wizard2.getHealth());
        //poison extends Spell so why not accepted?

    }

    @Test
    public void remainingMagic() {
        assertEquals(30, wizard.remainingMagic());
    }

    @Test
    public void replenishMagic() {
        wizard.replenishMagic(5);
        assertEquals(35, wizard.remainingMagic());
    }

    @Test
    public void getHealth() {
        assertEquals(20, wizard.getHealth());
    }

    @Test
    public void reduceHealth() {
        wizard.reduceHealth(5);
        assertEquals(15, wizard.getHealth());
    }

    @Test
    public void increaseHealth() {
        wizard.increaseHealth(5);
        assertEquals(25, wizard.getHealth());
    }

    @Test
    public void isEnemy() {
        assertFalse(wizard.isEnemy());
    }

    @Test
    public void getWallet() {
        assertEquals(40, wizard.getWallet());
    }

    @Test
    public void pay() {
        wizard.pay(5);
        assertEquals(35, wizard.getWallet());
    }

    @Test
    public void receiveMoney() {
        wizard.receiveMoney(5);
        assertEquals(45, wizard.getWallet());
    }

    @Test
    public void getName() {
        assertEquals("Merlin", wizard.getName());
    }
}