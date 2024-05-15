package users.customers;

import other_utilities.Collection;

import java.util.ArrayList;
import java.util.List;

public class BeneficiaryCollection implements Collection {
    private List<Beneficiary> beneficiaryCollection = new ArrayList<>();
    private int currentItem;

    public List<Beneficiary> getBeneficiaryCollection() {
        return beneficiaryCollection;
    }

    public void setBeneficiaryCollection(List<Beneficiary> beneficiaryCollection) {
        this.beneficiaryCollection = beneficiaryCollection;
    }
    /*
    public BeneficiaryCollection(List<Beneficiary> surveyorCollection) {
        this.beneficiaryCollection = surveyorCollection;
    }*/

    public BeneficiaryCollection() {
    }

    @Override
    public boolean hasNext() {
        if(currentItem >= beneficiaryCollection.size()){
            currentItem = 0;
            return  false;
        }
        return true;
    }

    @Override
    public Object next() {
        return beneficiaryCollection.get(currentItem++);
    }

    @Override
    public void add(Object object) {
        if(object instanceof PolicyHolder){
            beneficiaryCollection.add((PolicyHolder) object);
        } else if (object instanceof Dependent) {
            beneficiaryCollection.add((Dependent) object);
        }
    }
}
