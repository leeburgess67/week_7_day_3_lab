package Environment;

import Character.ClassTypes.ICaster;
import Character.ClassTypes.IHealer;
import Character.ClassTypes.IMelee;
import Character.Instances.Cleric;
import Character.Instances.Dwarf;
import Character.Instances.Wizard;
import Items.ITreasure;
import Items.Instances.MoneyBag;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RoomTest {

    Room room;
    IHealer cleric;
    IMelee dwarf;
    ICaster wizard;
    ITreasure moneyBag;
    ArrayList<IMelee> melees;
    ArrayList<ICaster> casters;
    ArrayList<IHealer> healers;
    ArrayList<ITreasure> treasures;

    @Before
    public void setUp() {
        cleric = new Cleric("Cleric", 10, false, 30);
        dwarf = new Dwarf("Littlejohn", 5, true, 100);
        wizard = new Wizard("Weasel", 9, 8, false, 60);
        moneyBag = new MoneyBag(10);

        melees = new ArrayList<IMelee>();
        casters = new ArrayList<ICaster>();
        healers = new ArrayList<IHealer>();
        treasures = new ArrayList<ITreasure>();

        melees.add(dwarf);
        casters.add(wizard);
        healers.add(cleric);
        treasures.add(moneyBag);

        room = new Room(melees, casters, healers, treasures, true);
    }

    @Test
    public void getCasters() {
        assertEquals(casters, room.getCasters());
    }

    @Test
    public void getHealers() {
        assertEquals(healers, room.getHealers());
    }

    @Test
    public void getMelees() {
        assertEquals(melees, room.getMelees());
    }

    @Test
    public void getTreasures() {
        assertEquals(treasures, room.getTreasures());
    }

    @Test
    public void getIsPlayersTurn() {
        assertTrue(room.getIsPlayersTurn());
    }

    @Test
    public void canToggleIsPlayersTurn(){
        room.indexTurn();
        assertFalse(room.getIsPlayersTurn());
    }

    @Test
    public void getAllies(){
    room.getAllies();
    assertEquals(room.allies, room.getAllies());
    }
}