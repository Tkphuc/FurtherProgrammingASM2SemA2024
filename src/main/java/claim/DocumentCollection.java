/*
 * *
 *  * @author <Team 31>
 *
 */

package claim;

import users.customers.Beneficiary;

import java.util.ArrayList;
import java.util.List;
import other_utilities.Collection;
public class DocumentCollection implements Collection {
    private List<String> documentCollection = new ArrayList<>();
    private int currentItem;

    public List<String> getDocumentCollection() {
        return documentCollection;
    }

    @Override
    public boolean hasNext() {
        if(currentItem >= documentCollection.size()){
            currentItem = 0;
            return false;
        }return true;
    }

    @Override
    public Object next() {
        return documentCollection.get(currentItem++);
    }

    @Override
    public void add(Object object) {
        if(object instanceof String){
            documentCollection.add((String) object);
        }
    }
}
