import CharacterAtributes.*;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        Strength Str = new Strength(18);
        Dexterity Dex = new Dexterity(15);
        Constitution Con = new Constitution(16);
        Intelligence Int = new Intelligence(14);
        Wisdom Wis = new Wisdom(12);
        Charisma Char = new Charisma(16);

        Characteristic[] stats = {Str, Dex, Con, Int, Wis, Char};


    }
}
