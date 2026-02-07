import java.math.BigDecimal;

public class Class {

    private String className;
    private BigDecimal hpModifier;
    private Skill[] skills;
    private int classID;

    static final Skill[] skillsChr = {Skill.burstArrow, Skill.hawkEye, Skill.mark};
    static final Skill[] skillsWar = {Skill.slash, Skill.secondBreath, Skill.swordFury};
    static final Skill[] skillsWiz = {Skill.fireball, Skill.madness, Skill.storm};

    public static final Class archer = new Class("Archer", BigDecimal.valueOf(1), skillsChr, 1);
    public static final Class warrior = new Class("Warrior", BigDecimal.valueOf(2), skillsWar, 2);
    public static final Class wizard = new Class("Wizard", BigDecimal.valueOf(0.5), skillsWiz, 3);


    public Class(String className, BigDecimal hpModifier, Skill[] skills, int classID) {
        this.className = className;
        this.hpModifier = hpModifier;
        this.skills = skills;
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public BigDecimal getHpModifier() {
        return hpModifier;
    }

    public Skill[] getSkills() {
        return skills;
    }

    @Override
    public int hashCode() {
        return classID;
    }
}
