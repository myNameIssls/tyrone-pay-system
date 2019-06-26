package cn.tyrone.pay.member.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberTestController {

    @GetMapping("/test")
    public String test(){
        String msg = "支付系统-会员服务-服务提供端-测试用例";
        return msg;
    }

}
