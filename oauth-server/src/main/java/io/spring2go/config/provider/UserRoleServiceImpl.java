package io.spring2go.config.provider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("UserRoleServiceImpl")
public class UserRoleServiceImpl implements UserRoleService{

    @Override
    public List<UserRole> getRoleByUser(SystemUser user) {
        UserRole userRole = new UserRole();
        userRole.setId(1L);
        userRole.setRole("ADMIN");
        userRole.setUserId(100L);
        List<UserRole> userRoles = new ArrayList<UserRole>();
        userRoles.add(userRole);
        return userRoles;
    }

}
