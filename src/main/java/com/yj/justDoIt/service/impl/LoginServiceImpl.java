package com.yj.justDoIt.service.impl;

import com.yj.justDoIt.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public boolean doLogin(String username, String password) {
        return true;
    }

}
