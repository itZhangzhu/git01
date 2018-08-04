package heima.dao;

import heima.domain.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {

    //注册
    @Insert("insert into users (username,password,telephone,state) values(#{username},#{password},#{telephone},#{state})")
    void doRegister(Users user);


    //登录
    @Select("select * from users where username=#{username} and password=#{password}")
    Users doLogin(Users user);
}
