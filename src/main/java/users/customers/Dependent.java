package users.customers;

public class Dependent extends Beneficiary {
    private PolicyHolder dependOn;
    public Dependent(){super();}

    public void RetrieveClaim(){}

    public PolicyHolder getDependOn() {
        return dependOn;
    }

    public void setDependOn(PolicyHolder dependOn) {
        this.dependOn = dependOn;
    }
}
