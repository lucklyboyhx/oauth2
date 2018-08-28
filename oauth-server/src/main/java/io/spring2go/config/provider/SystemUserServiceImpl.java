package io.spring2go.config.provider;

import org.springframework.stereotype.Service;

@Service("SystemUserServiceImpl")
public class SystemUserServiceImpl implements SystemUserService{

    @Override
    public SystemUser findByName(String userName) {
        SystemUser systemUser = new SystemUser();
        systemUser.setId(100L);
        systemUser.setUserName("hx");
        systemUser.setPassword("123");
        return systemUser;
    }

}
