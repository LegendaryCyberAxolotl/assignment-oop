

public class Race {

    static final String[] abHum = {"Human Universality", "heroic Fulfillment"};
    static final String[] abElf = {"Night Vision", "Fairy Heritage", "Trance", "Heightened Senses"};
    static final String[] abDwrf = {"Knowledge of Stone", "Dwarven Resilience", "Dwarven Combat Training"};
    static final String[] abDrag = {"Breath", "Color", "Damage Resistance"};
    static final String[] abOrc = {"Night Vision", "Savage Instinct", "Powerful Physique", "Menacing View", "Unwavering Fortitude", "Ferocious Attacks"};

    private String raceName;
    private float basicHp;
    private float speed;
    private String[] abilities;
    private int strBonus;
    private int dexBonus;
    private int conBonus;
    private int intBonus;
    private int wisBonus;
    private int charBonus;
    private int raceID;

    public static final Race human = new Race("Human", 100f, 1.40f, abHum, 2, 2, 2, 2, 2, 2, 1);
    public static final Race elf = new Race("Elf", 80f, 1.60f, abElf, 0, 4, 0, 0, 0, 2, 2);
    public static final Race dwarf = new Race("Dwarf", 120f, 1.20f, abDwrf, 4, 0, 3, 0, 0, 0, 3);
    public static final Race dragonborn = new Race("Dragonborn", 140f, 1.40f, abDrag, 5, 0, 2, 0, 0, 2, 4);
    public static final Race orc = new Race("Orc", 250f, 1.25f, abOrc, 6, 0, 4, 0, 0, 0, 5);

    public Race(String raceName, float basicHp, float speed, String[] abilities, int strBonus, int dexBonus, int conBonus, int intBonus, int wisBonus, int charBonus, int raceID) {
        this.raceName = raceName;
        this.basicHp = basicHp;
        this.speed = speed;
        this.abilities = abilities;
        this.strBonus = strBonus;
        this.dexBonus = dexBonus;
        this.conBonus = conBonus;
        this.intBonus = intBonus;
        this.wisBonus = wisBonus;
        this.charBonus = charBonus;
        this.raceID = raceID;
    }

    public String getRaceName() {
        return raceName;
    }

    public float getBasicHp() {
        return basicHp;
    }

    public float getSpeed() {
        return speed;
    }

    public String[] getAbilities() {
        return abilities;
    }



    @Override
    public int hashCode() {
        return raceID * 10;
    }
}
