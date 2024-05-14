package users.providers;

import java.util.ArrayList;
import java.util.List;

public class InsuranceManager extends Provider {
    private List<InsuranceSurveyor> surveyorList = new ArrayList<>();
    public InsuranceManager(){super();}
    public InsuranceSurveyor getSurveyor(String ID){
        SurveyorCollection surveyorCollection = new SurveyorCollection();
        surveyorCollection.setSurveyorCollection(surveyorList);
        while (surveyorCollection.hasNext()){
            if(surveyorCollection.next().equals(getID().equalsIgnoreCase(ID))){
                return (InsuranceSurveyor) surveyorCollection.next();
            }

        }return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsuranceManager that = (InsuranceManager) o;
        return this.getID().equals(that.getID());
    }

    @Override
    public int hashCode() {
        return this.getID().length();
    }
//public boolean ApproveClaim(){}
    //public users.providers.Beneficiary RetrieveSurveyors(){}

}
