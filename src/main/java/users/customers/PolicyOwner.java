/*
 * *
 *  * @author <Team 31>
 *
 */

/*
 * *
 *  * @author <Team 31>
 *
 */

package users.customers;

import java.util.List;

public class PolicyOwner extends Customer {
    private List<Beneficiary> beneficiaries;

    public PolicyOwner(){super();}
    public void FileClaim(){}
    public void UpdateClaim(){}
    public void RetrieveClaim(){}
    public void SetBeneficiaries(List<Beneficiary> beneficiaries){
        this.beneficiaries = beneficiaries;
    }

    public void RemoveBeneficiaries(){}

    public void GetBeneficiaries(){}
    /*
    public double CalculateYearlyFee() {
        final double DEPENDENT_COST_RATIO = 0.6;
        double feeSum;
        BeneficiaryCollection beneficiaryCollection = new BeneficiaryCollection();
        beneficiaryCollection.setBeneficiaryCollection(beneficiaries);

    while (beneficiaryCollection.hasNext()){
        if (beneficiaryCollection.next() instanceof PolicyHolder){

        } else if (beneficiaryCollection.next() instanceof Dependent) {

        }
    }
    return feeSum;
    }
    }*/

}
