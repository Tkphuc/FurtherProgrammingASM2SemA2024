public class SystemAdmin implements Users{
    private String fullName;
    private String adminID;
    public SystemAdmin(){}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }
    public void CalculateSuccessfulClaim(){}

    public void RetrieveClaim(){}
    public Users addUser()
    {}
    public Users deleteUser(){}
    public void updateUser(){}
    @Override
    public boolean Login(String ID, String password) {

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
