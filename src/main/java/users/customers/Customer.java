package users.customers;

import users.Users;

public abstract class Customer implements Users {
    private String customerID;
    private String fullName;
    private String password;
    public Customer() {
    }
    public String getID() {
        return customerID;
    }


    public void setID(String customerID) {
        this.customerID = customerID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean Login(String ID, String password) {
        return this.customerID.equals(ID) && this.password.equals(password);
    }
    @Override
    public void Logout() {

    }
    @Override
    public void updateFullName(String newName) {
        if(!newName.equals(this.fullName))
            this.fullName = newName;
    }
    @Override
    public void updatePassword() {

    }
}
