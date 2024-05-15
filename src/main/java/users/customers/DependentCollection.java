package users.customers;

import java.util.ArrayList;
import java.util.List;
import other_utilities.Collection;

public class DependentCollection implements Collection {
    private List<Dependent> dependentCollection = new ArrayList<>();
    private int currentItem;
    public DependentCollection(List<Dependent> dependentCollection) {
        this.dependentCollection = dependentCollection;
    }

    public List<Dependent> getDependentCollection() {
        return dependentCollection;
    }

    public void setDependentCollection(List<Dependent> dependentCollection) {
        this.dependentCollection = dependentCollection;
    }

    @Override
    public boolean hasNext() {
        if(currentItem >= dependentCollection.size()){
            currentItem = 0;
            return  false;
        }
        return true;
    }

    @Override
    public Object next() {
        return dependentCollection.get(currentItem++);
    }

    @Override
    public void add(Object object) {
        if(object instanceof Dependent)
        dependentCollection.add((Dependent) object);
    }
}
