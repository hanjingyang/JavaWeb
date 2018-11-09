package com.hans.yang.web.controller;

import com.hans.yang.bean.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created In Ctrip. <br/>
 *
 * @author: hj_yang <br/>
 * @date: 2018/11/2 <br/>
 */
@RestController
@RequestMapping(value="/users")
public class UserController {

  @RequestMapping(value = "/{user}",method = RequestMethod.GET)
  public User getUser(@PathVariable Long user){

    User userBean = new User();
    userBean.setId(121);
    userBean.setName("hans");
    return userBean;
  }

}
