import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.math.BigDecimal;

public class StaticDataLoader {

    public static void loadAll() {
        try (Connection conn = DBConnection.getConnection()) {

            // ------------------ Clear tables ------------------
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("DELETE FROM race_abilities");
                stmt.executeUpdate("DELETE FROM race");
                stmt.executeUpdate("DELETE FROM projectile_skill");
                stmt.executeUpdate("DELETE FROM target_skill");
                stmt.executeUpdate("DELETE FROM aoe_skill");
                stmt.executeUpdate("DELETE FROM skill");
                stmt.executeUpdate("DELETE FROM character_class");
                System.out.println("Old data cleared!");
            }

            // ------------------ Load races ------------------
            String insertRace = "INSERT INTO race (race_id, race_name, speed, basic_hp) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertRace)) {
                // Human
                ps.setInt(1, 1);
                ps.setString(2, "Human");
                ps.setFloat(3, 1.4f);
                ps.setFloat(4, 2f);
                ps.executeUpdate();

                // Elf
                ps.setInt(1, 2);
                ps.setString(2, "Elf");
                ps.setFloat(3, 1.6f);
                ps.setFloat(4, 0f);
                ps.executeUpdate();

                // Dwarf
                ps.setInt(1, 3);
                ps.setString(2, "Dwarf");
                ps.setFloat(3, 1.2f);
                ps.setFloat(4, 3f);
                ps.executeUpdate();

                // Dragonborn
                ps.setInt(1, 4);
                ps.setString(2, "Dragonborn");
                ps.setFloat(3, 1.4f);
                ps.setFloat(4, 5f);
                ps.executeUpdate();

                // Orc
                ps.setInt(1, 5);
                ps.setString(2, "Orc");
                ps.setFloat(3, 1.25f);
                ps.setFloat(4, 6f);
                ps.executeUpdate();
            }

            // ------------------ Race abilities ------------------
            String insertRaceAbility = "INSERT INTO race_abilities (race_id, ability_name) VALUES (?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertRaceAbility)) {
                // Human
                ps.setInt(1, 1);
                ps.setString(2, "Human Universality");
                ps.executeUpdate();
                ps.setString(2, "Heroic Fulfillment");
                ps.executeUpdate();

                // Elf
                ps.setInt(1, 2);
                ps.setString(2, "Night Vision");
                ps.executeUpdate();
                ps.setString(2, "Fairy Heritage");
                ps.executeUpdate();
                ps.setString(2, "Trance");
                ps.executeUpdate();
                ps.setString(2, "Heightened Senses");
                ps.executeUpdate();

                // Dwarf
                ps.setInt(1, 3);
                ps.setString(2, "Knowledge of Stone");
                ps.executeUpdate();
                ps.setString(2, "Dwarven Resilience");
                ps.executeUpdate();
                ps.setString(2, "Dwarven Combat Training");
                ps.executeUpdate();

                // Dragonborn
                ps.setInt(1, 4);
                ps.setString(2, "Breath");
                ps.executeUpdate();
                ps.setString(2, "Color");
                ps.executeUpdate();
                ps.setString(2, "Damage Resistance");
                ps.executeUpdate();

                // Orc
                ps.setInt(1, 5);
                ps.setString(2, "Night Vision");
                ps.executeUpdate();
                ps.setString(2, "Savage Instinct");
                ps.executeUpdate();
                ps.setString(2, "Powerful Physique");
                ps.executeUpdate();
                ps.setString(2, "Menacing View");
                ps.executeUpdate();
                ps.setString(2, "Unwavering Fortitude");
                ps.executeUpdate();
                ps.setString(2, "Ferocious Attacks");
                ps.executeUpdate();
            }

            // ------------------ Classes ------------------
            String insertClass = "INSERT INTO character_class (class_id, class_name, hp_modifier) VALUES (?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertClass)) {
                ps.setInt(1, 1);
                ps.setString(2, "Archer");
                ps.setFloat(3, 100f);
                ps.executeUpdate();

                ps.setInt(1, 2);
                ps.setString(2, "Warrior");
                ps.setFloat(3, 120f);
                ps.executeUpdate();

                ps.setInt(1, 3);
                ps.setString(2, "Wizard");
                ps.setFloat(3, 80f);
                ps.executeUpdate();
            }

            // ------------------ Skills ------------------
            String insertSkill = "INSERT INTO skill (skill_id, skill_name, type, recharge_seconds, level, power, skill_class) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertSkill)) {

                // Archer
                ps.setInt(1, 1);
                ps.setString(2, "Burst Arrow");
                ps.setString(3, "Projectile");
                ps.setFloat(4, 5f);
                ps.setInt(5, 1);
                ps.setInt(6, 1);
                ps.setString(7, "Archer");
                ps.executeUpdate();

                ps.setInt(1, 2);
                ps.setString(2, "Archer Mark");
                ps.setString(3, "Target");
                ps.setFloat(4, 60f);
                ps.setInt(5, 3);
                ps.setInt(6, 1);
                ps.setString(7, "Archer");
                ps.executeUpdate();

                ps.setInt(1, 3);
                ps.setString(2, "Hawk Eye");
                ps.setString(3, "AOE");
                ps.setFloat(4, 30f);
                ps.setInt(5, 5);
                ps.setInt(6, 1);
                ps.setString(7, "Archer");
                ps.executeUpdate();

                // Warrior
                ps.setInt(1, 4);
                ps.setString(2, "Slash");
                ps.setString(3, "Projectile");
                ps.setFloat(4, 10f);
                ps.setInt(5, 1);
                ps.setInt(6, 1);
                ps.setString(7, "Warrior");
                ps.executeUpdate();

                ps.setInt(1, 5);
                ps.setString(2, "Second Breath");
                ps.setString(3, "Target");
                ps.setFloat(4, 20f);
                ps.setInt(5, 3);
                ps.setInt(6, 1);
                ps.setString(7, "Warrior");
                ps.executeUpdate();

                ps.setInt(1, 6);
                ps.setString(2, "Sword o' fury");
                ps.setString(3, "AOE");
                ps.setFloat(4, 30f);
                ps.setInt(5, 5);
                ps.setInt(6, 1);
                ps.setString(7, "Warrior");
                ps.executeUpdate();

                // Mage
                ps.setInt(1, 7);
                ps.setString(2, "Fireball");
                ps.setString(3, "AOE");
                ps.setFloat(4, 20f);
                ps.setInt(5, 1);
                ps.setInt(6, 1);
                ps.setString(7, "Wizard");
                ps.executeUpdate();

                ps.setInt(1, 8);
                ps.setString(2, "Madness");
                ps.setString(3, "Target");
                ps.setFloat(4, 30f);
                ps.setInt(5, 3);
                ps.setInt(6, 1);
                ps.setString(7, "Wizard");
                ps.executeUpdate();

                ps.setInt(1, 9);
                ps.setString(2, "Storm");
                ps.setString(3, "AOE");
                ps.setFloat(4, 40f);
                ps.setInt(5, 5);
                ps.setInt(6, 1);
                ps.setString(7, "Wizard");
                ps.executeUpdate();
            }

            // ------------------ Projectile ------------------
            String insertProjectile = "INSERT INTO projectile_skill (skill_id, basic_strength, range, speed, strength_mod) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertProjectile)) {
                ps.setInt(1, 1);
                ps.setFloat(2, 10f);
                ps.setFloat(3, 10f);
                ps.setFloat(4, 50f);
                ps.setFloat(5, 2f);
                ps.executeUpdate();

                ps.setInt(1, 4);
                ps.setFloat(2, 15f);
                ps.setFloat(3, 10f);
                ps.setFloat(4, 10f);
                ps.setFloat(5, 2f);
                ps.executeUpdate();
            }

            // ------------------ Target ------------------
            String insertTarget = "INSERT INTO target_skill (skill_id, basic_strength, range, strength_mod) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertTarget)) {
                ps.setInt(1, 2);
                ps.setFloat(2, 0f);
                ps.setFloat(3, 100f);
                ps.setFloat(4, 1f);
                ps.executeUpdate();

                ps.setInt(1, 5);
                ps.setFloat(2, 25f);
                ps.setFloat(3, 0f);
                ps.setFloat(4, 1f);
                ps.executeUpdate();

                ps.setInt(1, 8);
                ps.setFloat(2, 5f);
                ps.setFloat(3, 20f);
                ps.setFloat(4, 1f);
                ps.executeUpdate();
            }

            // ------------------ AOE ------------------
            String insertAOE = "INSERT INTO aoe_skill (skill_id, basic_strength, range, radius, strength_mod) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertAOE)) {
                ps.setInt(1, 3);
                ps.setFloat(2, 20f);
                ps.setFloat(3, 75f);
                ps.setFloat(4, 20f);
                ps.setFloat(5, 1f);
                ps.executeUpdate();

                ps.setInt(1, 6);
                ps.setFloat(2, 50f);
                ps.setFloat(3, 10f);
                ps.setFloat(4, 10f);
                ps.setFloat(5, 1f);
                ps.executeUpdate();

                ps.setInt(1, 7);
                ps.setFloat(2, 20f);
                ps.setFloat(3, 50f);
                ps.setFloat(4, 20f);
                ps.setFloat(5, 1f);
                ps.executeUpdate();

                ps.setInt(1, 9);
                ps.setFloat(2, 30f);
                ps.setFloat(3, 100f);
                ps.setFloat(4, 50f);
                ps.setFloat(5, 1f);
                ps.executeUpdate();
            }

            System.out.println("All static data loaded successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}