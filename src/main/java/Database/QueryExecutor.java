package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecutor {
    public static void executeQuery(Connection conn) {
        String SQL = "SELECT * FROM public.Claim";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                System.out.println(rs.getString("column_name")); // Modify based on your column
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Connection conn = DatabaseConnector.connect();
        executeQuery(conn);
    }
}
