package io.spring.oscon.fortunes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class Fortunes {
    public static final String[] FORTUNES = new String[] {
            "Spring Cloud provides tools for developers to quickly build some of the common patterns",
            "in distributed systems (e.g. configuration management, service discovery, circuit breakers,",
            "intelligent routing, micro-proxy, control bus, one-time tokens, global locks, leadership election,",
            "distributed sessions, cluster state). Coordination of distributed systems leads to boiler plate patterns, ",
            "and using Spring Cloud developers can quickly stand up services and applications that implement those ",
            "patterns. They will work well in any distributed environment, including the developer's own laptop, bare ",
            "metal data centres, and managed platforms such as Cloud Foundry."
    };

    private Random random = new Random();

    @RequestMapping("/")
    public String fortunes() {
        return FORTUNES[random.nextInt(FORTUNES.length)];
    }

    public static void main(String[] args) {
        SpringApplication.run(Fortunes.class, args);
    }
}
