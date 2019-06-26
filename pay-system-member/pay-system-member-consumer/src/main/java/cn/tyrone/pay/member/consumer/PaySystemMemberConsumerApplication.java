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
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 支付系统-会员服务-消费者
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"cn.tyrone.pay.member.api.*"})
@ComponentScan(basePackages = {"cn.tyrone.pay.member.api.*"})
public class PaySystemMemberConsumerApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(PaySystemMemberConsumerApplication.class, args);
    }

    public void run(String... args) throws Exception {
        logger.info("------------------ 支付系统-会员服务-消费者-启动成功 ------------------");
    }
}
