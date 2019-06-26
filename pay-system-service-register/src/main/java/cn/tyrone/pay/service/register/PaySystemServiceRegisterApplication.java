package cn.tyrone.pay.service.register;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 支付系统-服务注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class PaySystemServiceRegisterApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(PaySystemServiceRegisterApplication.class, args);
    }

    public void run(String... args) throws Exception {
        logger.info("------------------ 支付系统-服务注册中心-启动成功 ------------------");
    }
}
