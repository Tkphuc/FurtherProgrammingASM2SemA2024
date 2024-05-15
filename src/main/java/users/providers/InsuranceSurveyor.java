package users.providers;

import java.util.Objects;

public class InsuranceSurveyor extends Provider{
    private InsuranceManager manager;
    public InsuranceSurveyor(){super();}
    //public claim.Claim proposeClaim(){}

    public InsuranceManager getManager() {
        return manager;
    }

    public void setManager(InsuranceManager manager) {
        this.manager = manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsuranceSurveyor that = (InsuranceSurveyor) o;
        return this.getID().equals(that.getID());
    }

    @Override
    public int hashCode() {
        return this.getID().length();
    }
}
