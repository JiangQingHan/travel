package travel.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import travel.entity.admin;
import travel.mapper.adminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@CrossOrigin
public class adminController {
    @Autowired
    adminMapper adminMapper;

    @RequestMapping("/login")
    public String login() {
        return "option";
    }

    @PostMapping("/admin")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        admin admin = adminMapper.getByName(username);
        if(admin != null) {
            if (password.equals(admin.getPassword())) {
                model.addAttribute("message", "hello");
                return "hello";
            } else {
                model.addAttribute("error", "用户名或密码错误");
                return "option";
            }
        }
        else {
            model.addAttribute("error", "用户名或密码错误");
            return "option";
        }
    }
}
