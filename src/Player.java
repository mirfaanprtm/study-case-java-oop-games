public class Player{
    private String name;
    private double health = 100;
    private Armor armor;
    private Weapon weapon;

    public void attack(Player deff) {
        System.out.println(this.name + " " + "attack " + deff.getName() +" dengan power " + this.weapon.getAttackPower());
    }

    public void deff(double attackPower) {
        this.health = this.health - (attackPower - this.armor.getDeffPower());
        System.out.println(this.name + " memiliki armor sebesar " + this.armor.getDeffPower());
        System.out.println(this.name + " menerima total damage sebesar " + (attackPower - this.armor.getDeffPower()));
    }

    public Player() {
    }

    public Player(String name, double health, Armor armor, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
    }

    public Player(double health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", armor=" + armor +
                ", weapon=" + weapon +
                '}';
    }
}
