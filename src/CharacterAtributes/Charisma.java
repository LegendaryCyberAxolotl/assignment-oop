package CharacterAtributes;

import java.math.BigDecimal;

public class Charisma extends Characteristic{
    private String type;

    public Charisma(BigDecimal value) {
        super(value);
        this.type = "Mental";
    }

    @Override
    public String getType() {
        return type;
    }
}