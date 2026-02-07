package CharacterAtributes;

public class Dexterity extends Characteristic{
    private String type;

    public Dexterity(int value) {
        super(value);
        this.type = "Physical";
    }

    @Override
    public String getType() {
        return type;
    }
}
