package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by Administrator on 2018/8/8.
 */
@RestController
public class UserController {
    //注入Service服务对象
    @Autowired
    private UserService userService;
    @RequestMapping("hello")
    public String showHello() {
        return "hello world";
    }

    /**
     * 返回对象
     */
    @RequestMapping("pojo")
    public User shoUser() {
        User u = new User();
        u.setId(1);
        u.setUsername("yy");
        u.setSex("男");
        u.setBirthday(new Date());
        u.setAddress("o");
        return u;
    }
    /**
     * 返回集合对象
     */
    @RequestMapping("maps")
    public Map<String,Object> showMaps(){
        Map<String,Object> maps=new HashMap<String,Object>();
        maps.put("username","yy");
        maps.put("age","19");
        return maps;
    }
    @RequestMapping("list")
    public List<User> showList(){
        List<User> uList=new ArrayList<User>();

        User u0 = new User();
        u0.setId(1);
        u0.setUsername("xx");
        u0.setSex("男");
        u0.setBirthday(new Date());
        u0.setAddress("o");

        User uo = new User();
        uo.setId(2);
        uo.setUsername("yy");
        uo.setSex("男");
        uo.setBirthday(new Date());
        uo.setAddress("o");
        uList.add(u0);
        uList.add(uo);
        return uList;
    }
    @RequestMapping("ssm")
    public  List<User> findAll(){
        List<User> list = userService.findAll();
        return  list;
    }

}
