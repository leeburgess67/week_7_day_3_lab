package Character.Instances;

import Character.ClassTypes.IHealer;
import Items.ItemType.HealingItem;
import Character.ICharacter;

public class Cleric implements IHealer {

    private int health;
    boolean enemy;
    int wallet;
    String name;

    public Cleric(String name, int health, boolean enemy, int wallet){
        this.wallet = wallet;
        this.enemy = enemy;
        this.health = health;
        this.name = name;
    }

    @Override
    public void heal(HealingItem item, ICharacter character) {

    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void reduceHealth(int damage) {
        this.health -= damage;

    }

    @Override
    public void increaseHealth(int heal) {
        this.health += heal;

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
        this.wallet -= cost;

    }

    @Override
    public void receiveMoney(int amount) {
        this.wallet += amount;

    }

    @Override
    public String getName() {
        return this.name;
    }
}

