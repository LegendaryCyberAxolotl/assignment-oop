package CharacterAtributes;

public class Strength extends Characteristic{
    private String type;

    public Strength(int value) {
        super(value);
        this.type = "Physical";
    }

    @Override
    public String getType() {
        return type;
    }
}
