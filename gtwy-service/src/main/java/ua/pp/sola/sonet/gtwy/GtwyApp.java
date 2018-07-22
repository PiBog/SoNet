package ua.pp.sola.sonet.gtwy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GtwyApp {

    public static void main(String[] args) {
        SpringApplication.run(GtwyApp.class, args);
    }

}
