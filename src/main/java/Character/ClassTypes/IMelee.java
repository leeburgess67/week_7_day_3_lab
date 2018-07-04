package Character.ClassTypes;
import Character.ICharacter;
import Items.ItemType.Weapon;

public interface IMelee extends ICharacter {

    void draw(Weapon weapon);
    void sheath();
    int getStrangth();
    void attack(ICharacter character);

}
