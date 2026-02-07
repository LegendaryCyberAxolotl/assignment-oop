public class Class {

    private String className;
    private float hpModifier;
    private Skill[] skills;
    private int classID;

    static final Skill[] skillsChr = {Skill.burstArrow, Skill.hawkEye, Skill.mark};
    static final Skill[] skillsWar = {Skill.slash, Skill.secondBreath, Skill.swordFury};
    static final Skill[] skillsWiz = {Skill.fireball, Skill.madness, Skill.storm};

    public static final Class archer = new Class("Archer", 1f, skillsChr, 1);
    public static final Class warrior = new Class("Warrior", 2f, skillsWar, 2);
    public static final Class wizard = new Class("Wizard", 0.5f, skillsWiz, 3);


    public Class(String className, float hpModifier, Skill[] skills, int classID) {
        this.className = className;
        this.hpModifier = hpModifier;
        this.skills = skills;
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public float getHpModifier() {
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
