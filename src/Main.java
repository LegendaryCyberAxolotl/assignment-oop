import CharacterAtributes.*;

import java.math.BigDecimal;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Strength Str = new Strength(BigDecimal.valueOf(18));
        Dexterity Dex = new Dexterity(BigDecimal.valueOf(15));
        Constitution Con = new Constitution(BigDecimal.valueOf(16));
        Intelligence Int = new Intelligence(BigDecimal.valueOf(14));
        Wisdom Wis = new Wisdom(BigDecimal.valueOf(12));
        Charisma Char = new Charisma(BigDecimal.valueOf(16));

        Characteristic[] stats = {Str, Dex, Con, Int, Wis, Char};

        try (Connection conn = DBConnection.getConnection()) {
            System.out.println("Connected to DB successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }



        StaticDataLoader.loadAll();

        RenodCharacter.addRenod();


    }
}
