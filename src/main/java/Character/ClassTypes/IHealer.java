package Character.ClassTypes;
import Character.ICharacter;
import Items.ItemType.HealingItem;

public interface IHealer extends ICharacter {

    void heal(HealingItem item, ICharacter character);
}
