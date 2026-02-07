package CharacterAtributes;

import java.math.BigDecimal;

public class Constitution extends Characteristic{
    private String type;

    public Constitution(BigDecimal value) {
        super(value);
        this.type = "Physical";
    }

    @Override
    public String getType() {
        return type;
    }
}