public abstract class Skill {
    private String skillName;
    private float rechargeSeconds;
    private int level;
    private int power;

    public static final Projectile burstArrow = new Projectile("Burst Arrow", 5f, 1, 1, 10f, 10f, 50f, 2f);
    public static final Target mark = new Target("Archer Mark", 60f, 3, 1, 0f, 100f, 1f);
    public static final AOEskill hawkEye = new AOEskill("Hawk Eye", 30f, 5, 1, 20f, 75f, 20f, 1);

    public static final Projectile slash = new Projectile("Slash", 10f, 1, 1, 15f, 10f, 10f, 2f);
    public static final Target secondBreath = new Target("Second Breath", 20f, 3, 1, 25f, 0f, 1f);
    public static final AOEskill swordFury = new AOEskill("Sword o' fury", 30f, 5, 1, 50f, 10f, 10f, 1);

    public static final AOEskill fireball = new AOEskill("Fireball", 20f, 1, 1, 20f, 50f, 20f, 1);
    public static final Target madness = new Target("Madness", 30f, 3, 1, 5f, 20f, 1f);
    public static final AOEskill storm = new AOEskill("Storm", 40f, 5, 1, 30f, 100f, 50f, 1);

    public Skill (String skillName, float rechargeSeconds, int level, int power) {
        this.skillName = skillName;
        this.rechargeSeconds = rechargeSeconds;
        this.level = level;
        this.power = power;
    }

    public abstract String getType();

    public String getSkillName() {
        return skillName;
    }

    public float getRechargeSeconds() {
        return rechargeSeconds;
    }

    public int getLevel() {
        return level;
    }

    public int getPower() {
        return power;
    }
}
