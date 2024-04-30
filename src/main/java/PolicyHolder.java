import java.util.List;

public class PolicyHolder extends Beneficiary {
    private List<Dependent> dependents;
    public PolicyHolder(){super();}
    public void FileClaim(){};
    public void UpdateClaim(){};
    public void RetrieveClaim(){};
}
