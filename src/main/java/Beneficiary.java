public abstract class Beneficiary extends Customer {
    private InsuranceCard insuranceCard;
    private String address;
    private String email;
    private String phoneNumber;
    public Beneficiary(){
        super();
        this.address = "example address";
        this.email = "example email";
        this.phoneNumber = "example phone number";
    }
    public InsuranceCard getInsuranceCard() {
        return insuranceCard;
    }
    public void setInsuranceCard(InsuranceCard insuranceCard) {
        this.insuranceCard = insuranceCard;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
