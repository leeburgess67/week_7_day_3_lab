package Character.ClassTypes;
import Character.ICharacter;
import Items.ItemType.Spell;

public interface ICaster extends ICharacter {

    void cast(Spell spell, ICharacter targetCharacter);
    int remainingMagic();
    void replenishMagic(int amount);

}
