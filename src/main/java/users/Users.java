/*
 * *
 *  * @author <Team 31>
 *
 */

package users;

public interface Users {
    boolean Login(String ID,String password);
    void Logout();
    void updateFullName(String newName);
    void updatePassword();
    String getID();
    String getPassword();
    String getFullName();
    void setFullName(String fullName);
    void setPassword(String password);
    void setID(String ID);

}
