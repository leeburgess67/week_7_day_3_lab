package Character.Instances;

import Character.ClassTypes.IMelee;
import Items.ItemType.Weapon;
import Character.ICharacter;

import java.util.ArrayList;

public class Dwarf implements IMelee{

    private Weapon activeWeapon;
    private int health;
    int carryingCapacity;
    boolean enemy;
    ArrayList<Weapon> weapons;
    int wallet;
    String name;

    public Dwarf(String name, int health, boolean enemy, int wallet){
        this.wallet = wallet;
        this.activeWeapon = null;
        this.carryingCapacity = 200;
        this.enemy = enemy;
        this.health = health;
        this.weapons = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void draw(Weapon weapon) {
        this.activeWeapon = weapon;

    }

    @Override
    public void sheath() {
        this.activeWeapon = null;

    }

    @Override
    public int getStrength() {
        return this.carryingCapacity;
    }

    @Override
    public void attack(ICharacter character) {
        character.reduceHealth(activeWeapon.getDamage());

    }

    @Override
    public void pickUpWeapon(Weapon weapon) {
        this.weapons.add(weapon);

    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public Weapon getActiveWeapon() {
        return this.activeWeapon;
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
