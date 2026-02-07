package CharacterAtributes;

import java.math.BigDecimal;

public class Intelligence extends Characteristic{
    private String type;

    public Intelligence(BigDecimal value) {
        super(value);
        this.type = "Mental";
    }

    @Override
    public String getType() {
        return type;
    }
}
