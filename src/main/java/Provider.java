public abstract class Provider implements Users {
    private String providerID;
    private String fullName;
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

    @Override
    public void Login() {

    }

    @Override
    public void Logout() {

    }

    @Override
    public void updateFullName() {

    }

    @Override
    public void updatePassword() {

    }
}
