/**
 * Created by b204 on 2016/10/18.
 */
public class AccessValidator {
    private String userID;
    //private String password = "123456";

    public boolean validateUser(String userID){
        return true;
    }
    public boolean isAdmin(String userID){
        return userID.equals("admin");
    }
}
