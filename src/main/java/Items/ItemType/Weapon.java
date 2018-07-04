package Items.ItemType;

import Items.ITreasure;

import java.util.HashMap;

public abstract class Weapon implements ITreasure {

    private String name;
    private int weight;
    private int damage;
    private int handWield;

    public Weapon(String name, int weight, int damage, int handWield){
        this.name = name;
        this.weight = weight;
        this.damage = damage;
        this.handWield = handWield;
    }

    @Override
    public HashMap<String, Integer> inspect() {
        HashMap<String, Integer> properties = new HashMap<>();
        properties.put("Weight" , this.weight);
        properties.put("Damage" , this.damage);
        properties.put("Number of hands used" , this.handWield);
        return properties;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHandWield() {
        return this.handWield;
    }

    public String getName() {
        return this.name;
    }
}
