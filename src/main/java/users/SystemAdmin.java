/*
 * *
 *  * @author <Team 31>
 *
 */

package users;

public class SystemAdmin implements Users {
    private String fullName;
    private String adminID;
    private String password;
    public SystemAdmin(){}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getID() {
        return adminID;
    }

    public void setID(String adminID) {
        this.adminID = adminID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void CalculateSuccessfulClaim(){}

    public void RetrieveClaim(){}
    //public users.Users addUser()
    {}
    //public users.Users deleteUser(){}
    public void updateUser(){}
    @Override
    public boolean Login(String ID, String password) {
        return ID.equals(this.adminID) && password.equals(this.password);
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
