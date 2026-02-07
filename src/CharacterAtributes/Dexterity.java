package CharacterAtributes;

import java.math.BigDecimal;

public class Dexterity extends Characteristic{
    private String type;

    public Dexterity(BigDecimal value) {
        super(value);
        this.type = "Physical";
    }

    @Override
    public String getType() {
        return type;
    }
}
