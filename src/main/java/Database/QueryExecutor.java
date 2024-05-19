/*
 * *
 *  * @author <Team 31>
 *
 */

package Database;

import claim.Claim;
import claim.ReceiverBankingInfo;
import claim.Status;
import insurance_card.InsuranceCard;
import other_utilities.DateWrapper;
import users.customers.Beneficiary;
import users.customers.Dependent;
import users.customers.PolicyHolder;
import users.customers.PolicyOwner;
import users.providers.InsuranceManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
/*https://stackoverflow.com/questions/11983554/reading-data-from-database-and-storing-in-array-list-object*/
/*https://stackoverflow.com/questions/17502827/how-to-get-the-list-inside-a-resultset*/
public class QueryExecutor {
    DateWrapper dateWrapper = new DateWrapper();
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
            pstmt.setString(3, claim.getInsuredPerson().getID()); // Ensure InsuredPerson class has getCustomerID method
            pstmt.setString(4, claim.getCardNumber());
            pstmt.setDate(5, new Date(claim.getExamDate().getTime()));
            // Assuming getDocuments returns a List<String>
            pstmt.setArray(6, conn.createArrayOf("text", claim.getDocuments().toArray(new String[0])));
            pstmt.setDouble(7, claim.getClaimAmount());
            pstmt.setString(8, claim.getStatusAsString()); // Assuming getStatus returns a String
            pstmt.setString(9, claim.getReceiverBankingInfo().getBankingInfoID()); // Ensure ReceiverBankingInfo class has getBankingInfoID method

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void insertPolicyOwner(Connection conn, PolicyOwner policyOwner) {
        String SQL = "INSERT INTO public.PolicyOwner (customerID, fullName,password,beneficiaries) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1,policyOwner.getID());
            pstmt.setString(2, policyOwner.getFullName());
            pstmt.setString(3,policyOwner.getPassword() );
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void insertPolicyHolder(Connection conn, PolicyHolder policyHolder) {
        String SQL = "INSERT INTO public.Holder (customerID, fullName,password,beneficiaries) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1,policyHolder.getID());
            pstmt.setString(2, policyHolder.getFullName());
            pstmt.setString(3,policyHolder.getPassword());
            pstmt.setString(4,policyHolder.getAddress());
            pstmt.setString(5,policyHolder.getEmail());
            pstmt.setString(6,policyHolder.getPhoneNumber());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void insertDependent(Connection conn, Dependent dependent) {
        String SQL = "INSERT INTO public.Holder (customerID, fullName,password,beneficiaries) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1,dependent.getID());
            pstmt.setString(2, dependent.getFullName());
            pstmt.setString(3,dependent.getPassword());
            pstmt.setString(4,dependent.getAddress());
            pstmt.setString(5,dependent.getEmail());
            pstmt.setString(6,dependent.getPhoneNumber());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static List<Claim> loadAllClaims (Connection conn){
        String query = "SELECT * FROM Claim";
        ArrayList<Claim> allClaims = new ArrayList<>();
        try (PreparedStatement pstmt = conn.prepareStatement(query)){
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()){
                Claim claim = new Claim();
                claim.setReceiverBankingInfo((ReceiverBankingInfo) resultSet.getObject("receiverBankingInfo"));
                claim.setClaimDate(resultSet.getDate("claimDate"));
                claim.setClaimID(resultSet.getString("claimID"));
                claim.setExamDate(resultSet.getDate("examDate"));
                claim.setStatus((Status) resultSet.getObject("status"));
                claim.setInsuredPerson((Beneficiary) resultSet.getObject("insuredPerson"));
                ArrayList<String> documentsList = resultSet.getObject("Documents",ArrayList.class);
                claim.setDocuments(documentsList);
                claim.setCardNumber(resultSet.getString("cardNumber"));
                claim.setClaimAmount(resultSet.getDouble("claimAmount"));
                allClaims.add(claim);
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return allClaims;
    }

    public static List<PolicyHolder> loadAllPolicyHolders(Connection conn){
        String query = "SELECT * FROM PolicyHolder";
        ArrayList<PolicyHolder> allPolicyHolder = new ArrayList<>();
        try (PreparedStatement pstmt = conn.prepareStatement(query)){
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()){
                PolicyHolder policyHolder = new PolicyHolder();
                policyHolder.setAddress(resultSet.getString("address"));
                policyHolder.setEmail(resultSet.getString("email"));
                policyHolder.setPhoneNumber(resultSet.getString("phoneNumber"));
                policyHolder.setInsuranceCard((InsuranceCard) resultSet.getObject("insuranceCard"));
                policyHolder.setFullName(resultSet.getString("fullName"));
                policyHolder.setID(resultSet.getString("customerID"));
                policyHolder.setPassword(resultSet.getString("password"));
                policyHolder.setDependents((resultSet.getObject("dependents", List.class));
                allPolicyHolder.add(policyHolder);
            }
        }catch (SQLException e){

        }
        return allPolicyHolder;
    }
    public static List<Dependent> loadAllDependents(Connection conn){
        String query = "SELECT * FROM Dependent";
        ArrayList<Dependent> allDependents = new ArrayList<>();
        try (PreparedStatement pstmt = conn.prepareStatement(query)){
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()){
                Dependent dependent = new Dependent();
                dependent.setAddress(resultSet.getString("address"));
                dependent.setEmail(resultSet.getString("email"));
                dependent.setPhoneNumber(resultSet.getString("phoneNumber"));
                dependent.setInsuranceCard((InsuranceCard) resultSet.getObject("insuranceCard"));
                dependent.setFullName(resultSet.getString("fullName"));
                dependent.setID(resultSet.getString("customerID"));
                dependent.setPassword(resultSet.getString("password"));
                dependent.setDependOn((PolicyHolder) resultSet.getObject("dependOn"));
                dependent.setInsuranceCard();
                allDependents.add(dependent);
            }
        }catch (SQLException e){

        }
        return allDependents;
    }
    public static List<PolicyOwner> loadAllPolicyOwners(Connection conn){
        String query = "SELECT * FROM PolicyOwner";
        ArrayList<PolicyOwner> allPolicyOwners = new ArrayList<>();
        try (PreparedStatement pstmt = conn.prepareStatement(query)){
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()){
                PolicyOwner policyOwner = new PolicyOwner();
                policyOwner.setID(resultSet.getString("customerID"));
                policyOwner.setPassword(resultSet.getString("password"));
                policyOwner.setFullName(resultSet.getString("fullName"));
                policyOwner.SetBeneficiaries(resultSet.getObject("beneficiaries", List.class));
                allPolicyOwners.add(policyOwner);
            }
        }catch (SQLException e){

        }
        return allPolicyOwners;
    }
    public static List<InsuranceManager> loadAllInsuranceManagers(Connection conn){
        String query = "SELECT * FROM InsuranceManager";
        ArrayList<InsuranceManager> allInsuranceManagers = new ArrayList<>();
        try (PreparedStatement pstmt = conn.prepareStatement(query)){
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()){
                InsuranceManager insuranceManager = new InsuranceManager();
                insuranceManager.setID(resultSet.getString("customerID"));
                insuranceManager.setPassword(resultSet.getString("password"));
                insuranceManager.setFullName(resultSet.getString("fullName"));
                insuranceManager.setSurveyorList(resultSet.getObject("surveyorList",List.class));
                allInsuranceManagers.add(insuranceManager);
            }
        }catch (SQLException e){

        }
        return allInsuranceManagers;
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
