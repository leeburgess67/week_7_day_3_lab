package Items.ItemType;

import Items.ITreasure;

import java.util.HashMap;

public abstract class Spell implements ITreasure {

    private int damage;
    private int magicUsed;
    private String name;

    public Spell(String name, int damage, int magicUsed){
        this.name = name;
        this.magicUsed = magicUsed;
        this.damage = damage;

    }

    @Override
    public HashMap<String, Integer> inspect() {
        HashMap<String, Integer> properties = new HashMap<>();
        properties.put("Damage" , this.damage);
        properties.put("Magic Used" , this.magicUsed);
        return properties;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getMagicUsed() {
        return magicUsed;
    }

}
