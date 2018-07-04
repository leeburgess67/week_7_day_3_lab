package Character;

public interface ICharacter {

    int getHealth();
    void reduceHealth(int damage);
    void increaseHealth(int heal);
    boolean isEnemy();
    double getWallet();
    void pay(double cost);
    void receiveMoney(double amount);

}
