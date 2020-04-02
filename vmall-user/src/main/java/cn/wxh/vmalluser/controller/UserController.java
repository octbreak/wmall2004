package cn.wxh.vmalluser.controller;

import cn.wxh.vmalluser.bean.UmsMember;
import cn.wxh.vmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @ResponseBody
    @RequestMapping("/users")
    public List<UmsMember> users() {
        List<UmsMember> listUmsMembers = userService.getAllMembers();
        return listUmsMembers;
    }
}
