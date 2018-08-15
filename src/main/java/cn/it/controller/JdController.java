package cn.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/8/14.
 */
@Controller
public class JdController {

    @RequestMapping("jd")
    public  String showJD(){

        return "index";
    }
}
