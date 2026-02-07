package CharacterAtributes;

public abstract class Characteristic {
    private int value;
    private float modifier;

    public Characteristic(int value) {
        this.value = value;

        modifier = (value - 10) / 2;
    }

    public int getValue() {
        return value;
    }

    public float getModifier() {
        return modifier;
    }

    public void addBonus(int bonus) {
        value += bonus;

        modifier = (value - 10) / 2;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setModifier() {
        modifier = (value - 10) / 2;
    }

    public String getType() {
        return "Type";
    }
}
