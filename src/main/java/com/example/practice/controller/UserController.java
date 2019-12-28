package com.example.practice.controller;

import com.example.practice.service.UserService;
import com.example.practice.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "checkOverlapId", method = RequestMethod.GET)
    public String checkOverlapId(String id) {
        if (userService.checkOverlapId(id)) {

        }
        return "";
    }

    @RequestMapping(value = "view/login", method = RequestMethod.GET)
    public String loginPage() {
        return "user/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(UserVo user, HttpSession session) {
        if (userService.login(user)) {

        }
        return "redirect:board/main";
    }

    @RequestMapping(value = "view/detail", method = RequestMethod.GET)
    public String detailPage(Model model, HttpSession session) {
        String userId = (String)session.getAttribute("id");
        UserVo user = userService.getUser(userId);
        return "user/detail";
    }

    @RequestMapping(value = "view/modify", method = RequestMethod.GET)
    public String modifyPage(Model model) {
        return "user/modify";
    }

    @RequestMapping(value = "modify", method = RequestMethod.POST)
    public String modifyUser(UserVo user) {
        if (userService.modify(user)) {

        }

        return "user/detail";
    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {

        return "redirect:board/main";
    }
}
