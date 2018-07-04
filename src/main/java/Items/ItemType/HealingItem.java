package Items.ItemType;

import Items.ITreasure;

import java.util.HashMap;

public abstract class HealingItem implements ITreasure {

    private String name;
    private int healingPower;
    private int cost;

    public HealingItem(String name, int healingPower, int cost){
        this.cost = cost;
        this.healingPower = healingPower;
        this.name = name;
    }

    @Override
    public HashMap<String, Integer> inspect() {
        HashMap<String, Integer> properties = new HashMap<>();
        properties.put("Healing power" , this.healingPower);
        properties.put("Cost" , this.cost);
        return properties;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
