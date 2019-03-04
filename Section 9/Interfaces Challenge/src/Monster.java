import java.util.ArrayList;

public class Monster implements ISaveable {
    private String name;
    private int stamina;
    private int strength;

    public Monster(String name, int stamina, int strength) {
        this.name = name;
        this.stamina = stamina;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.stamina);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.stamina = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
}
