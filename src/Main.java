import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "";
        String user = "";
        String pass = "";

        try(Connection conn = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Connected to Database successfully.");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM department");

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");  
                System.out.println("ID: " + id + ", Name: " + name);   

            }
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
