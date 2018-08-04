package heima.service.Impl;

import heima.dao.IUserDao;
import heima.domain.Users;
import heima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public void doRegister(Users user) {
        userDao.doRegister(user);
    }

    @Override
    public Users doLogin(Users user) {

        return userDao.doLogin(user);
    }
}
