package cn.tyrone.pay.member.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 支付系统-会员服务-服务提供端
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaySystemMemberProviderApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(PaySystemMemberProviderApplication.class, args);
    }

    public void run(String... args) throws Exception {
        logger.info("------------------ 支付系统-会员服务-服务提供端-启动成功 ------------------");
    }
}
