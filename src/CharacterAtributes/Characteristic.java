package CharacterAtributes;

import java.math.BigDecimal;

public abstract class Characteristic {
    private BigDecimal value;
    private BigDecimal modifier;

    public Characteristic(BigDecimal value) {
        this.value = value;

        this.modifier = value.subtract(BigDecimal.TEN).divide(BigDecimal.valueOf(2));
    }

    public BigDecimal getValue() {
        return value;
    }

    public BigDecimal getModifier() {
        return modifier;
    }

    public void addBonus(BigDecimal bonus) {
        value = value.add(bonus);

        this.modifier = value.subtract(BigDecimal.TEN).divide(BigDecimal.valueOf(2));
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setModifier() {
        modifier = value.subtract(BigDecimal.TEN).divide(BigDecimal.valueOf(2));
    }

    public String getType() {
        return "Type";
    }
}
