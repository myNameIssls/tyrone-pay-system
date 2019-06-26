package cn.tyrone.pay.member.consumer;

import cn.tyrone.pay.member.api.service.MemberTestFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 支付系统-会员服务-消费者
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"cn.tyrone.pay.member.api.*"})
public class PaySystemMemberConsumerApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MemberTestFeignService memberTestFeignService;

    public static void main(String[] args) {
        SpringApplication.run(PaySystemMemberConsumerApplication.class, args);
    }

    public void run(String... args) throws Exception {

        String test = memberTestFeignService.test();

        System.out.println(test);

        logger.info("------------------ 支付系统-会员服务-消费者-启动成功 ------------------");
    }
}
