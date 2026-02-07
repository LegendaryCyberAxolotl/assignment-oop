import CharacterAtributes.*;

public class Character {
    private String name;
    private int level;
    private Race charRace;
    private Class charClass;
    private float hp;
    private String[] equipment;
    private float speed;
    private Characteristic[] characteristics;


    public Character(String name, int level, Race charRace, Class charClass, String[] equipment, Characteristic[] characteristics) {
        this.name = name;
        this.level = level;
        this.charRace = charRace;
        this.equipment = equipment;
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public Race getCharRace() {
        return charRace;
    }

    public String[] getEquipment() {
        return equipment;
    }

    public Characteristic[] getCharacteristics() {
        return characteristics;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCharRace(Race charRace) {
        this.charRace = charRace;
    }

    public void setCharClass(Class charClass) {
        this.charClass = charClass;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setCharacteristics(Characteristic[] characteristics) {
        this.characteristics = characteristics;
    }

    private int nameToHash(String str) {
        int hash = 0;
        for (char c : str.toCharArray()) {
            hash = 31 * hash + c; // стандартное хэширование строки
        }
        return hash;
    }

    @Override
    public int hashCode() {
        int nameHash = nameToHash(name);
        int raceHash = charRace.hashCode();
        int classHash = charClass.hashCode();

        return nameHash + raceHash + classHash;

    }
}