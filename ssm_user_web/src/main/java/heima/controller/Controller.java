package heima.controller;


import heima.domain.Users;
import heima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class Controller {

    @Autowired
    private IUserService userService;

    @RequestMapping("/doRegister")
    public String doRegister(Users user){

        userService.doRegister(user);

        return "login";
    }
    //我是一条注释
    //我也是 小分支  数量是否接受了丰盛的龙卷风的史莱克
    @RequestMapping("/doLogin")
    public ModelAndView doLogin(Users user){

        Users users = userService.doLogin(user);
        ModelAndView view = new ModelAndView();
        if (users != null ) {
            view.addObject("user", users);
            view.setViewName("success");
            return view;
        }
        view.setViewName("login");
        return null;
    }

}
