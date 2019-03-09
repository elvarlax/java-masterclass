import java.util.ArrayList;

public class Player implements ISaveable {
    private String name;
    private int stamina;
    private int strength;
    private int agility;
    private int intellect;
    private int spirit;

    public Player(String name, int stamina, int strength, int agility, int intellect, int spirit) {
        this.name = name;
        this.stamina = stamina;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.spirit = spirit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", stamina=" + stamina +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intellect=" + intellect +
                ", spirit=" + spirit +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.stamina);
        values.add(2, "" + this.strength);
        values.add(3, "" + this.agility);
        values.add(4, "" + this.intellect);
        values.add(5, "" + this.spirit);
        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.stamina = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.agility = Integer.parseInt(savedValues.get(3));
            this.intellect = Integer.parseInt(savedValues.get(4));
            this.spirit = Integer.parseInt(savedValues.get(5));
        }
    }
}
