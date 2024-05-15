package claim;

import users.customers.Customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Claim {

    private String claimID;
    private Date claimDate;
    private Customer insuredPerson;
    private String CardNumber;
    private Date examDate;
    private List<String> Documents = new ArrayList<>();
    private double claimAmount;
    private Status status;
    private ReceiverBankingInfo receiverBankingInfo;
    public Claim(){
        this.claimID = "claim ID";
        this.CardNumber = "card number";
        this.claimAmount = 0;
        this.status = Status.NEW;
    }

    public String getClaimID() {
        return claimID;
    }

    public void setClaimID(String claimID) {
        this.claimID = claimID;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public Customer getInsuredPerson() {
        return insuredPerson;
    }

    public void setInsuredPerson(Customer insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public List<String> getDocuments() {
        return Documents;
    }

    public void setDocuments(List<String> documents) {
        Documents = documents;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public void addDocument(String document) {
        if(!Documents.contains(document)){
            Documents.add(document);
        }
    }
    public ReceiverBankingInfo getReceiverBankingInfo() {
        return receiverBankingInfo;
    }
    public void setReceiverBankingInfo(ReceiverBankingInfo receiverBankingInfo) {
        this.receiverBankingInfo = receiverBankingInfo;
    }
}
