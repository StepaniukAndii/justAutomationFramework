package RazooM.AlloTest.TheInternetHerokuapp;

public class GettersAndSetors {
    private String loginPageName;
    private String loginPagePassword;

    protected void setPassword(String password) {
        this.loginPagePassword = password;
    }
    protected String getPassword(){
        return loginPagePassword;
    }
    protected void setName(String name) {
        this.loginPageName = name;
    }
    protected String getName(){
        return loginPageName;
    }
}