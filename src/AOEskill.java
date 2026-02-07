public class AOEskill extends Skill {
    private float basicStrength;
    private float currentStrength;
    private float range;
    private float radius;
    private float strengthMod;

    public AOEskill (String skillName, float rechargeSeconds, int level, int power, float basicStrength, float range, float radius, float strengthMod) {
        super(skillName, rechargeSeconds, level, power);
        this.basicStrength = basicStrength;
        this.range = range;
        this.radius = radius;
        this.strengthMod = strengthMod;

        currentStrength = basicStrength * strengthMod;
    }

    public float getBasicStrength() {
        return basicStrength;
    }

    public float getRange() {
        return range;
    }

    public float getRadius() {
        return radius;
    }

    public float getStrengthMod() {
        return strengthMod;
    }

    public float getCurrentStrength() {
        return currentStrength;
    }

    @Override
    public String getType() {
        return "AOE";
    }

}
