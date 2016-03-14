/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.spring.boot.libbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import af.libbo.LibClient;
import af.libbo.LibServer;

/**
 *
 * @author Alessandro Falappa
 */
@Configuration
@ConditionalOnClass({LibServer.class, LibClient.class})
@EnableConfigurationProperties(LibProperties.class)
public class LibAutoConfiguration {

    @Autowired
    LibProperties props;

    @Bean
    @ConditionalOnMissingBean(LibServer.class)
    public LibServer lbServ() {
        System.out.println("Autoconfiguring LibServer");
        LibServer ls = new LibServer(props.getServerId());
        return ls;
    }

    @Bean
    @ConditionalOnMissingBean(LibClient.class)
    public LibClient lbClient() {
        System.out.println("Autoconfiguring LibClient");
        LibClient lc = new LibClient(props.getClientPort());
        return lc;
    }
}
