/*
 * *
 *  * @author <Team 31>
 *
 */

package users.customers;

public class customerFactory {
    public static Customer createCustomer(String customerType){
        if(customerType.equalsIgnoreCase("Policy Owner"))
            return new PolicyOwner();
        else if(customerType.equalsIgnoreCase("Policy Holder"))
            return new PolicyHolder();
        else if(customerType.equalsIgnoreCase("Dependent"))
            return new Dependent();
        else
            System.out.println("Wrong input");
        return null;
    }
}
