package Environment;

import Character.ClassTypes.ICaster;
import Character.ClassTypes.IHealer;
import Character.ClassTypes.IMelee;
import Items.ITreasure;
import Character.ICharacter;

import java.util.ArrayList;

public class Room {

    private ArrayList<IMelee> melees;
    private ArrayList<ICaster> casters;
    private ArrayList<IHealer> healers;
    private ArrayList<ITreasure> treasures;
    public ArrayList<ICharacter> allies;
    public ArrayList<ICharacter> enemies;
    private boolean isPlayersTurn;


    public Room(ArrayList<IMelee> melees, ArrayList<ICaster> casters, ArrayList<IHealer> healers, ArrayList<ITreasure> treasures, boolean isPlayersTurn) {
        this.melees = melees;
        this.casters = casters;
        this.healers = healers;
        this.treasures = treasures;
        this.isPlayersTurn = isPlayersTurn;
    }

    public ArrayList<ICaster> getCasters() {
        return this.casters;
    }

    public ArrayList<IHealer> getHealers() {
        return this.healers;
    }

    public ArrayList<IMelee> getMelees() {
        return this.melees;
    }

    public ArrayList<ITreasure> getTreasures() {
        return this.treasures;
    }

    public boolean getIsPlayersTurn() {
        return this.isPlayersTurn;
    }

    public void indexTurn() {
        if (this.isPlayersTurn == true) {
            this.isPlayersTurn = false;
        } else {
            this.isPlayersTurn = true;
        }
    }

    public ArrayList<ICharacter> getCharacters(){
        ArrayList<ICharacter> characters = new ArrayList<>();
        characters.addAll(melees);
        characters.addAll(casters);
        characters.addAll(healers);
        return characters;
    }
//Are {} correct?
    public ArrayList<ICharacter> getAllies() {
        //should it be ICharacter melee etc?
        ArrayList<ICharacter> allies = new ArrayList<>();
        for (IMelee melee : melees) {
            if (!melee.isEnemy()) {
                allies.add(melee);
            }
        }
        for (IHealer healer : healers) {
            if (!healer.isEnemy()) {
                allies.add(healer);
            }
        }
        for (ICaster caster : casters) {
            if (!caster.isEnemy()) {
                allies.add(caster);
            }
        }
        return allies;
    }

    public ArrayList<ICharacter> getEnemies() {
        for (ICharacter melee : melees) {
            for (ICharacter healer : healers) {
                for (ICharacter caster : casters) {
                    if (melee.isEnemy()) {
                        enemies.add(melee);
                    } else if (healer.isEnemy()) {
                        enemies.add(healer);
                    } else if (caster.isEnemy()) {
                        enemies.add(caster);
                    }
                }
            }
        }
        return enemies;


    }
}




