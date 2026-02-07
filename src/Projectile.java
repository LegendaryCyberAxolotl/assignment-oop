public class Projectile extends Skill {
    private float basicStrength;
    private float currentStrength = 0;
    private float range;
    private float speed;
    private float strengthMod;

    public Projectile (String skillName, float rechargeSeconds, int level, int power, float basicStrength, float range, float speed, float strengthMod) {
        super(skillName, rechargeSeconds, level, power);
        this.basicStrength = basicStrength;
        this.range = range;
        this.speed = speed;
        this.strengthMod = strengthMod;

        currentStrength += basicStrength * strengthMod;
    }

    public float getBasicStrength() {
        return basicStrength;
    }

    public float getRange() {
        return range;
    }

    public float getSpeed() {
        return speed;
    }

    public float getStrengthMod() {
        return strengthMod;
    }

    public float getCurrentStrength() {
        return currentStrength;
    }

    @Override
    public String getType() {
        return "Projectile";
    }

}

