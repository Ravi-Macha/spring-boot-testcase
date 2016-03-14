/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.spring.boot.libbo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author Alessandro Falappa
 */
@ConfigurationProperties(prefix = "lib")
public class LibProperties {

    /**
     * Server identification.
     */
    private String serverId;
    /**
     * Client identification.
     */
    private int clientPort;

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public int getClientPort() {
        return clientPort;
    }

    public void setClientPort(int clientPort) {
        this.clientPort = clientPort;
    }

}
