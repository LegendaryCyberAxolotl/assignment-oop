import java.math.BigDecimal;

public abstract class Skill {
    private String skillName;
    private BigDecimal rechargeSeconds;
    private int level;
    private int power;

    public static final Projectile burstArrow = new Projectile("Burst Arrow", BigDecimal.valueOf(5), 1, 1, BigDecimal.valueOf(10), BigDecimal.valueOf(10), BigDecimal.valueOf(50), BigDecimal.valueOf(2));
    public static final Target mark = new Target("Archer Mark", BigDecimal.valueOf(60), 3, 1, BigDecimal.valueOf(0), BigDecimal.valueOf(100), BigDecimal.valueOf(1));
    public static final AOEskill hawkEye = new AOEskill("Hawk Eye", BigDecimal.valueOf(30), 5, 1, BigDecimal.valueOf(20), BigDecimal.valueOf(75), BigDecimal.valueOf(20), BigDecimal.valueOf(1));

    public static final Projectile slash = new Projectile("Slash", BigDecimal.valueOf(10), 1, 1, BigDecimal.valueOf(15), BigDecimal.valueOf(10), BigDecimal.valueOf(10), BigDecimal.valueOf(2));
    public static final Target secondBreath = new Target("Second Breath", BigDecimal.valueOf(20), 3, 1, BigDecimal.valueOf(25), BigDecimal.valueOf(0), BigDecimal.valueOf(1));
    public static final AOEskill swordFury = new AOEskill("Sword o' fury", BigDecimal.valueOf(30), 5, 1, BigDecimal.valueOf(50), BigDecimal.valueOf(10), BigDecimal.valueOf(10), BigDecimal.valueOf(1));

    public static final AOEskill fireball = new AOEskill("Fireball", BigDecimal.valueOf(20), 1, 1, BigDecimal.valueOf(20), BigDecimal.valueOf(50), BigDecimal.valueOf(20), BigDecimal.valueOf(1));
    public static final Target madness = new Target("Madness", BigDecimal.valueOf(30), 3, 1, BigDecimal.valueOf(5), BigDecimal.valueOf(20), BigDecimal.valueOf(1));
    public static final AOEskill storm = new AOEskill("Storm", BigDecimal.valueOf(40), 5, 1, BigDecimal.valueOf(30), BigDecimal.valueOf(100), BigDecimal.valueOf(50), BigDecimal.valueOf(1));

    public Skill (String skillName, BigDecimal rechargeSeconds, int level, int power) {
        this.skillName = skillName;
        this.rechargeSeconds = rechargeSeconds;
        this.level = level;
        this.power = power;
    }

    public abstract String getType();

    public String getSkillName() {
        return skillName;
    }

    public BigDecimal getRechargeSeconds() {
        return rechargeSeconds;
    }

    public int getLevel() {
        return level;
    }

    public int getPower() {
        return power;
    }
}
