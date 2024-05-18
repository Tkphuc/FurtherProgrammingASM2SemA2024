package users.customers;

import java.util.List;

public class PolicyHolder extends Beneficiary {
    private List<Dependent> dependents;
    public PolicyHolder(){super();}
    public void FileClaim(){}
    public void UpdateClaim(){}
    public void RetrieveClaim(){}
    public void updatePolicyHolder(){}

    public List<Dependent> getDependents() {
        return dependents;
    }

    public void setDependents(List<Dependent> dependents) {
        this.dependents = dependents;
    }
}
