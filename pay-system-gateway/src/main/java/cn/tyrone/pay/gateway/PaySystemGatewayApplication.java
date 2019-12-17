package cn.tyrone.pay.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 支付系统-网关服务
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients(basePackages = {"cn.tyrone.pay.member.api.*"})
public class PaySystemGatewayApplication implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(PaySystemGatewayApplication.class, args);
    }

    public void run(String... args) throws Exception {
        logger.info("------------------ 支付系统-网关服务-启动成功 ------------------");
    }
}
