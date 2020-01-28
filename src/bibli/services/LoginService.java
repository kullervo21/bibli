package bibli.services;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named /*("loginService")*/ 
@SessionScoped
public class LoginService implements Serializable {


    private static final long serialVersionUID = -5433850275008415405L;

    private String login = "James";
    private String password = "007";
    
    public String getLogin() {
        System.out.println( "in getLogin" );
        return login;
    }

    public void setLogin(String login) {
        System.out.println( "in setLogin with " + login );
        this.login = login;
    }
    
    public String getPassword() {
        System.out.println( "in getPassword" );
        return password;
    }
    
    public void setPassword(String password) {
        System.out.println( "in setPassword with " + password );
        this.password = password;
    }
    
    
    public String returnAction() {
        System.out.println( "in returnAction" );
        return password.equals( "007" ) ? "success" : "failure";
    }
    
}