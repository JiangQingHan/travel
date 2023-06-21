package travel.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import travel.entity.User;
import travel.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class userController {
    @Autowired
    userMapper userMapper;

    @RequestMapping("/select1")
    public List<User> select1(){
        return userMapper.selectList(null);
    }
}
