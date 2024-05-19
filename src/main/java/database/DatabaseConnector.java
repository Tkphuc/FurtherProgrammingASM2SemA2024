/*
 * *
 *  * @author <Team 31>
 *
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String URL = "jdbc:postgresql://aws-0-us-west-1.pooler.supabase.com:5432/postgres";
    private static final String USER = "postgres.iksjbzekgggvbnrryrvu";
    private static final String PASSWORD = "FPASM2SemA2024";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
