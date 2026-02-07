import java.math.BigDecimal;

public class Projectile extends Skill {
    private BigDecimal basicStrength;
    private BigDecimal currentStrength = BigDecimal.valueOf(0);
    private BigDecimal range;
    private BigDecimal speed;
    private BigDecimal strengthMod;

    public Projectile (String skillName, BigDecimal rechargeSeconds, int level, int power, BigDecimal basicStrength, BigDecimal range, BigDecimal speed, BigDecimal strengthMod) {
        super(skillName, rechargeSeconds, level, power);
        this.basicStrength = basicStrength;
        this.range = range;
        this.speed = speed;
        this.strengthMod = strengthMod;

        this.currentStrength = basicStrength.multiply(strengthMod);
    }

    public BigDecimal getBasicStrength() {
        return basicStrength;
    }

    public BigDecimal getRange() {
        return range;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public BigDecimal getStrengthMod() {
        return strengthMod;
    }

    public BigDecimal getCurrentStrength() {
        return currentStrength;
    }

    @Override
    public String getType() {
        return "Projectile";
    }

}

