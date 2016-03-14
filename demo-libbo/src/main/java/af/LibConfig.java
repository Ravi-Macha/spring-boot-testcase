/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af;

import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Alessandro Falappa
 */
@Configuration
public class LibConfig {
    // The following beans are correctly detected by af.spring.boot.libbo.LibAutoConfiguration in af-spring.boot-libbo module
    // Uncomment these and comment the ones in DemoLibboApplication to verify

//    @Bean
//    public LibServer libServ() {
//        LibServer lb = new LibServer("pluto");
//        return lb;
//    }
//    @Bean
//    public LibClient libClient() {
//        LibClient lb = new LibClient(123);
//        return lb;
//    }
}
