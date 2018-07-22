package ua.pp.sola.sonet.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class ConfigServApp {


        public static void main(String[] args) {
            SpringApplication.run(ConfigServApp.class, args);
        }

}
