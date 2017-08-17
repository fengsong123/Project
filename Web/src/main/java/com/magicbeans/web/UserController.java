package com.magicbeans.web;


import com.baomidou.mybatisplus.plugins.Page;
import com.magicbeans.entity.User;
import com.magicbeans.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author magic-beans
 * @since 2017-07-28
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;


    @GetMapping("page")
    public Page<User> findPage(){
        return userService.selectPage(new Page<User>());
    }

    @GetMapping("update")
    public void update(){
      User user =   userService.selectById("1");
      userService.updateById(user);
    }

    @GetMapping("save")
    public void save(){
        User user = new User();
        user.setName("asdasdadsad");
        userService.insert(user);
    }

	
}
