package cn.tyrone.pay.member.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "pay-system-member-provider")
public interface MemberTestFeignService {

    @GetMapping("/member/test")
    public String test();

}
