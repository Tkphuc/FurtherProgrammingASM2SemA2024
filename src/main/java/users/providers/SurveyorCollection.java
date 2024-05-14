package users.providers;

import java.util.ArrayList;

import java.util.List;

public class SurveyorCollection implements other_utilities.Collection{
    private List<InsuranceSurveyor> surveyorCollection = new ArrayList<>();
    private int currentItem;

    public SurveyorCollection(List<InsuranceSurveyor> surveyorCollection, int currentItem) {
        this.surveyorCollection = surveyorCollection;
        this.currentItem = currentItem;
    }

    public SurveyorCollection() {
    }

    public List<InsuranceSurveyor> getSurveyorCollection() {
        return surveyorCollection;
    }

    public void setSurveyorCollection(List<InsuranceSurveyor> surveyorCollection) {
        this.surveyorCollection = surveyorCollection;
    }

    @Override
    public boolean hasNext() {
        if(currentItem >= surveyorCollection.size()){
            currentItem = 0;
            return  false;
        }
        return true;
    }

    @Override
    public Object next() {
        return surveyorCollection.get(currentItem++);
    }

    @Override
    public void add(Object object) {
        if(object instanceof InsuranceSurveyor)
        surveyorCollection.add((InsuranceSurveyor) object);
    }
}
