package cn.tyrone.pay.system.transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 支付-交易系统-服务层入口
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TransactionServiceApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(TransactionServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("----------- 支付-交易系统-服务层入口-启动成功 -----------");
    }
}
