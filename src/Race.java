import java.math.BigDecimal;

public class Race {

    static final String[] abHum = {"Human Universality", "heroic Fulfillment"};
    static final String[] abElf = {"Night Vision", "Fairy Heritage", "Trance", "Heightened Senses"};
    static final String[] abDwrf = {"Knowledge of Stone", "Dwarven Resilience", "Dwarven Combat Training"};
    static final String[] abDrag = {"Breath", "Color", "Damage Resistance"};
    static final String[] abOrc = {"Night Vision", "Savage Instinct", "Powerful Physique", "Menacing View", "Unwavering Fortitude", "Ferocious Attacks"};

    private String raceName;
    private BigDecimal basicHp;
    private BigDecimal speed;
    private String[] abilities;
    private int strBonus;
    private int dexBonus;
    private int conBonus;
    private int intBonus;
    private int wisBonus;
    private int charBonus;
    private int raceID;

    public static final Race human = new Race("Human", BigDecimal.valueOf(100), BigDecimal.valueOf(1.40), abHum, 2, 2, 2, 2, 2, 2, 1);
    public static final Race elf = new Race("Elf", BigDecimal.valueOf(80), BigDecimal.valueOf(1.60), abElf, 0, 4, 0, 0, 0, 2, 2);
    public static final Race dwarf = new Race("Dwarf", BigDecimal.valueOf(120), BigDecimal.valueOf(1.20), abDwrf, 4, 0, 3, 0, 0, 0, 3);
    public static final Race dragonborn = new Race("Dragonborn", BigDecimal.valueOf(140), BigDecimal.valueOf(1.40), abDrag, 5, 0, 2, 0, 0, 2, 4);
    public static final Race orc = new Race("Orc", BigDecimal.valueOf(250), BigDecimal.valueOf(1.25), abOrc, 6, 0, 4, 0, 0, 0, 5);

    public Race(String raceName, BigDecimal basicHp, BigDecimal speed, String[] abilities, int strBonus, int dexBonus, int conBonus, int intBonus, int wisBonus, int charBonus, int raceID) {
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

    public BigDecimal getBasicHp() {
        return basicHp;
    }

    public BigDecimal getSpeed() {
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
