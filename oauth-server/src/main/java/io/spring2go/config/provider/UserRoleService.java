package io.spring2go.config.provider;

import java.util.List;

public interface UserRoleService {

    List<UserRole> getRoleByUser(SystemUser user);

}
