package io.spring2go.config.provider;

import java.io.Serializable;

public class UserRole implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -5363836757288861907L;

    private Long id;

    private String role;
    private Long userId;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
