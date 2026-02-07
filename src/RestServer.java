import static spark.Spark.*;
import java.sql.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class RestServer {

    public static void main(String[] args) {

        port(4567);

        get("/", (req, res) -> {
            res.type("text/plain");
            return "Server is running";
        });

        get("/characters", (req, res) -> {
            JSONArray charactersArray = new JSONArray();

            try (Connection conn = DBConnection.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT c.name, c.level, r.race_name, cl.class_name " +
                         "FROM character c " +
                         "JOIN race r ON c.race_id = r.race_id " +
                         "JOIN character_class cl ON c.class_id = cl.class_id")) {

                while (rs.next()) {
                    JSONObject characterJson = new JSONObject();
                    characterJson.put("name", rs.getString("name"));
                    characterJson.put("level", rs.getInt("level"));
                    characterJson.put("race", rs.getString("race_name"));
                    characterJson.put("class", rs.getString("class_name"));

                    charactersArray.put(characterJson);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            res.type("application/json");
            return charactersArray.toString();
        });

        // Получить скиллы персонажа по имени
        get("/skills/:characterName", (req, res) -> {
            String characterName = req.params("characterName");
            JSONArray skillsArray = new JSONArray();

            String query = "SELECT s.skill_name, s.type, s.recharge_seconds, s.level, s.power, cl.class_name " +
                    "FROM skill s " +
                    "JOIN character_class cl ON s.skill_class = cl.class_name " +
                    "JOIN character c ON c.class_id = cl.class_id " +
                    "WHERE c.name = ?";

            try (Connection conn = DBConnection.getConnection();
                 PreparedStatement ps = conn.prepareStatement(query)) {

                ps.setString(1, characterName);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    JSONObject skillJson = new JSONObject();
                    skillJson.put("name", rs.getString("skill_name"));
                    skillJson.put("type", rs.getString("type"));
                    skillJson.put("recharge", rs.getDouble("recharge_seconds"));
                    skillJson.put("level", rs.getInt("level"));
                    skillJson.put("power", rs.getInt("power"));
                    skillJson.put("class", rs.getString("class_name"));

                    skillsArray.put(skillJson);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            res.type("application/json");
            return skillsArray.toString();
        });

        System.out.println("REST API запущен на http://localhost:4567");
    }
}