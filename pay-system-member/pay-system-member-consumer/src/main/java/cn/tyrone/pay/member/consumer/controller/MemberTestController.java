package cn.tyrone.pay.member.consumer.controller;

import cn.tyrone.pay.member.api.service.MemberTestFeignService;
import cn.tyrone.pay.member.api.util.MemberApplicationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberTestController {

    @Autowired private MemberTestFeignService memberTestFeignService;

    @GetMapping("/test")
    public String test(){
        System.out.println("进入测试。。。。。。。。。。。");
        String msg = memberTestFeignService.test();

        return msg;
    }

}
