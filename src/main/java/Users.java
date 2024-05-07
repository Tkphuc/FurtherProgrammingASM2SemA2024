public interface Users {
    boolean Login(String ID,String password);
    void Logout();
    void updateFullName(String newName);
    void updatePassword();
}
