package heima.service;

import heima.domain.Users;

public interface IUserService {

    void doRegister(Users user);

    Users doLogin(Users user);
}
