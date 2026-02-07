package CharacterAtributes;

public class Intelligence extends Characteristic{
    private String type;

    public Intelligence(int value) {
        super(value);
        this.type = "Mental";
    }

    @Override
    public String getType() {
        return type;
    }
}
