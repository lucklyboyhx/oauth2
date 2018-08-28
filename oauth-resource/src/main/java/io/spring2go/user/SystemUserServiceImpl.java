package io.spring2go.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("systemUserServiceImpl")
public class SystemUserServiceImpl implements SystemUserService{

    @Override
    public SystemUser findByUsername(String username) {
        SystemUser systemUser = new SystemUser();
        systemUser.setId(100L);
        systemUser.setUserName("hx");
        systemUser.setPassword("123");
        
        UserRole userRole = new UserRole();
        userRole.setId(1L);
        userRole.setRole("ADMIN");
        userRole.setUserId(100L);
        List<UserRole> userRoles = new ArrayList<UserRole>();
        userRoles.add(userRole);
        
        systemUser.setUserRoles(userRoles);
        
        return systemUser;
    }

}
