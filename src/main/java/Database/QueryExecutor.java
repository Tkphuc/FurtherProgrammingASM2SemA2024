package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.Arrays;


public class QueryExecutor {

    // Method to execute a query to fetch data from the "Claim" table
    public static void executeQuery(Connection conn) {
        String SQL = "SELECT * FROM public.Claim";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                // Modify "column_name" to the actual column you want to retrieve
                System.out.println(rs.getString("column_name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Method to insert a new claim into the database
    public static void insertClaim(Connection conn, Claim claim) {
        String SQL = "INSERT INTO public.Claim (claim_id, claim_date, insured_person_id, card_number, exam_date, documents, claim_amount, status, banking_info_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, claim.getClaimID());
            pstmt.setDate(2, new Date(claim.getClaimDate().getTime()));
            pstmt.setString(3, claim.getInsuredPerson().getCustomerID()); // Ensure InsuredPerson class has getCustomerID method
            pstmt.setString(4, claim.getCardNumber());
            pstmt.setDate(5, new Date(claim.getExamDate().getTime()));
            // Assuming getDocuments returns a List<String>
            pstmt.setArray(6, conn.createArrayOf("text", claim.getDocuments().toArray(new String[0])));
            pstmt.setDouble(7, claim.getClaimAmount());
            pstmt.setString(8, claim.getStatus()); // Assuming getStatus returns a String
            pstmt.setString(9, claim.getReceiverBankingInfo().getBankingInfoID()); // Ensure ReceiverBankingInfo class has getBankingInfoID method

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Connection conn = DatabaseConnector.connect(); // Ensure DatabaseConnector class exists and can establish a connection
        // Call both methods to demonstrate functionality
        executeQuery(conn);
        // You would typically create a Claim object here and pass it to insertClaim
        // Claim claim = new Claim(...);
        // insertClaim(conn, claim);
    }
}
