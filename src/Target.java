public class Target extends Skill {
    private float basicStrength;
    private float currentStrength;
    private float range;
    private float strengthMod;

    public Target (String skillName, float rechargeSeconds, int level, int power, float basicStrength, float range, float strengthMod) {
        super(skillName, rechargeSeconds, level, power);
        this.basicStrength = basicStrength;
        this.range = range;
        this.strengthMod = strengthMod;

        currentStrength = basicStrength * strengthMod;
    }

    public float getBasicStrength() {
        return basicStrength;
    }

    public float getRange() {
        return range;
    }

    public float getStrengthMod() {
        return strengthMod;
    }

    public float getCurrentStrength() {
        return currentStrength;
    }

    @Override
    public String getType() {
        return "Target";
    }

}
