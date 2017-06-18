package com.yuntao.hello;

import com.yahier.User;
import jdk.nashorn.internal.objects.NativeJSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.portlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by pengyuntao on 16/10/12.
 */
@Controller
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public class HelloController {

    /**
     * 映射jsp
     * @param model
     * @return
     */
    @RequestMapping(value = "/yahier", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "yahier");
        model.addAttribute("key1", "iphone");
        model.addAttribute("key2", "sangsung s7");

        return "hello";
    }

    /**
     * 输出json 测试失败
     * @param modelMap
     * @return
     */
    @ResponseBody
    @RequestMapping("/json")
    public User list(ModelMap modelMap) {
        User user = new User();
        user.setAge(18);
        user.setName("yahier");

        return user;
    }

}
