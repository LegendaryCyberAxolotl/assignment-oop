import java.math.BigDecimal;

public class AOEskill extends Skill {
    private BigDecimal basicStrength;
    private BigDecimal currentStrength;
    private BigDecimal range;
    private BigDecimal radius;
    private BigDecimal strengthMod;

    public AOEskill (String skillName, BigDecimal rechargeSeconds, int level, int power, BigDecimal basicStrength, BigDecimal range, BigDecimal radius, BigDecimal strengthMod) {
        super(skillName, rechargeSeconds, level, power);
        this.basicStrength = basicStrength;
        this.range = range;
        this.radius = radius;
        this.strengthMod = strengthMod;

        this.currentStrength = basicStrength.multiply(strengthMod);
    }

    public BigDecimal getBasicStrength() {
        return basicStrength;
    }

    public BigDecimal getRange() {
        return range;
    }

    public BigDecimal getRadius() {
        return radius;
    }

    public BigDecimal getStrengthMod() {
        return strengthMod;
    }

    public BigDecimal getCurrentStrength() {
        return currentStrength;
    }

    @Override
    public String getType() {
        return "AOE";
    }

}
