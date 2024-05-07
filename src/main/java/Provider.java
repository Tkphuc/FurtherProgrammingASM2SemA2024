public abstract class Provider implements Users {
    private String providerID;
    private String fullName;
    private String password
    public Provider(){}
    public String getProviderID() {
        return providerID;
    }

    public void setProviderID(String providerID) {
        this.providerID = providerID;
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
        if(ID.equals(this.providerID) && password.equals(this.password)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void Logout() {

    }

    @Override
    public void updateFullName(String newName) {

    }

    @Override
    public void updatePassword() {

    }
}
