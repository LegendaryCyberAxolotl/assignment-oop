package CharacterAtributes;

public class Constitution extends Characteristic{
    private String type;

    public Constitution(int value) {
        super(value);
        this.type = "Physical";
    }

    @Override
    public String getType() {
        return type;
    }
}