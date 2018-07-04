package Character.ClassTypes;
import Character.ICharacter;

public interface ICaster extends ICharacter {

    void cast(ICharacter targetCharacter);
    int remainingMagic();
    void replenishMagic(int amount);
}
