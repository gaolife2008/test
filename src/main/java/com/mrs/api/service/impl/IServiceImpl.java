package com.mrs.api.service.impl;

import com.mrs.api.domain.User;
import com.mrs.api.service.IService;
import org.springframework.stereotype.Service;

@Service
public class IServiceImpl implements IService {
    @Override
    public User getString() {
        User user = new User();
        user.setNum("28dddddd417");
        user.setAge("30");
        user.setName("1111");
        return user;
    }
}
