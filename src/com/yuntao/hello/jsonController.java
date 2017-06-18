package com.yuntao.hello;

import com.yahier.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lenovo on 2017/6/18.
 */
@Controller
@RequestMapping("/json")
public class jsonController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "yahier";
    }

    /**
     * 还差输出的配置，在mvc-servlet.xml中怎么写呢
     * @return
     */
    @RequestMapping(value="/user",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public User get() {
        User u = new User();
        u.setName("jayjay");
        return u;
    }
}
