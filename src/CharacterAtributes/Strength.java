package CharacterAtributes;

import java.math.BigDecimal;

public class Strength extends Characteristic{
    private String type;

    public Strength(BigDecimal value) {
        super(value);
        this.type = "Physical";
    }

    @Override
    public String getType() {
        return type;
    }
}
