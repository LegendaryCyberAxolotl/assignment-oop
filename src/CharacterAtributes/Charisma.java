package CharacterAtributes;

public class Charisma extends Characteristic{
    private String type;

    public Charisma(int value) {
        super(value);
        this.type = "Mental";
    }

    @Override
    public String getType() {
        return type;
    }
}