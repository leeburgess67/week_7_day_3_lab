package Character.ClassTypes;
import Character.ICharacter;
import Items.ItemType.Weapon;

public interface IMelee extends ICharacter {

    void draw(Weapon weapon);
    void sheath();
    int getStrength();
    void attack(ICharacter character);
    void pickUpWeapon(Weapon weapon);

}
