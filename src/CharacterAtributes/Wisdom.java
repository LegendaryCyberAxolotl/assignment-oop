package CharacterAtributes;

public class Wisdom extends Characteristic{
    private String type;

    public Wisdom(int value) {
        super(value);
        this.type = "Mental";
    }

    @Override
    public String getType() {
        return type;
    }
}
