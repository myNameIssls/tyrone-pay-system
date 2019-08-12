package cn.tyrone.pay.gateway.authentication;


import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 认证鉴权过滤器
 */
@Component
public class AuthenticationFilter implements GlobalFilter, Ordered {

    /**
     * 认证鉴权
     * @param exchange
     * @param chain
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        // TODO 调用会员服务进行认证鉴权

        return null;
    }

    @Override
    public int getOrder() {
        return 100;
    }
}
