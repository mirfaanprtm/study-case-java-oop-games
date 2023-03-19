public class Armor {
    private String name;
    private double deffPower;

    public Armor() {
    }

    public Armor(String name, double deffPower) {
        this.name = name;
        this.deffPower = deffPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeffPower() {
        return deffPower;
    }

    public void setDefPower(double defPower) {
        this.deffPower = defPower;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "name='" + name + '\'' +
                ", deffPower=" + deffPower +
                '}';
    }
}
