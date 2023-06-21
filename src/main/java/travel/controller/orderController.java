package travel.controller;
import travel.entity.order;
import travel.mapper.orderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@CrossOrigin
public class orderController {
    @Autowired
    orderMapper orderMapper;

    @RequestMapping("/select2")
    public List<order> select2(){return orderMapper.selectList(null);}
}
