package io.spring2go.config.provider;

import java.io.Serializable;

public class SystemUser implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -6545942228021264176L;

    private Long id;

    private String userName;
    private String password;

    public SystemUser(){}

    public SystemUser(SystemUser user){
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.id = user.getId();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
