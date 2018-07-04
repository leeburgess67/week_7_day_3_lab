package Character.Instances;

import Character.ClassTypes.ICaster;
import Items.ItemType.Spell;
import Character.ICharacter;
import Items.ItemType.Weapon;

import java.util.ArrayList;

public class Wizard implements ICaster {

    private Weapon activeSpell;
    private int health;
    int magic;
    boolean enemy;
    ArrayList<Weapon> spells;
    int wallet;
    String name;

    public Wizard(String name, int health, int magic, boolean enemy, int wallet){
        this.wallet = wallet;
        this.activeSpell = null;
        this.magic = magic;
        this.enemy = enemy;
        this.health = health;
        this.spells = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void cast(Spell spell, ICharacter targetCharacter) {

    }

    @Override
    public int remainingMagic() {
        return this.magic;
    }

    @Override
    public void replenishMagic(int amount) {

    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void reduceHealth(int damage) {

    }

    @Override
    public void increaseHealth(int heal) {

    }

    @Override
    public boolean isEnemy() {
        return this.enemy;
    }

    @Override
    public int getWallet() {
        return this.wallet;
    }

    @Override
    public void pay(int cost) {

    }

    @Override
    public void receiveMoney(int amount) {

    }

    @Override
    public String getName() {
        return this.name;
    }
}
