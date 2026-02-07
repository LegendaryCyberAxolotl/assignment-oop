package CharacterAtributes;

import java.math.BigDecimal;

public class Wisdom extends Characteristic{
    private String type;

    public Wisdom(BigDecimal value) {
        super(value);
        this.type = "Mental";
    }

    @Override
    public String getType() {
        return type;
    }
}
