import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RenodCharacter {

    public static void addRenod() {
        String insertCharacter = "INSERT INTO character (name, level, race_id, class_id) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(insertCharacter)) {

            ps.setString(1, "Asmas");       // имя персонажа
            ps.setInt(2, 1);                 // уровень
            ps.setInt(3, 1);                 // race_id = 1 → Human
            ps.setInt(4, 1);                 // class_id = 1 → Archer

            ps.executeUpdate();
            System.out.println("Character Asmas added to database successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}