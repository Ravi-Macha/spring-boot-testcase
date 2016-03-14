package af;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import af.libbo.LibClient;
import af.libbo.LibServer;

@SpringBootApplication
public class DemoLibboApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoLibboApplication.class, args);
        System.out.println("*******************");
        System.out.format("LibServer beans %s%n", Arrays.toString(ctx.getBeanNamesForType(LibServer.class)));
        System.out.format("LibClient beans %s%n", Arrays.toString(ctx.getBeanNamesForType(LibClient.class)));
    }

    // The following beans are not detected by af.spring.boot.libbo.LibAutoConfiguration in af-spring.boot-libbo module
    // Thus we end up with two LibServer and two LibClient beans in the context
    @Bean
    public LibServer libServ() {
        LibServer lb = new LibServer("pluto");
        return lb;
    }

    @Bean
    public LibClient libClient() {
        LibClient lb = new LibClient(123);
        return lb;
    }
}
