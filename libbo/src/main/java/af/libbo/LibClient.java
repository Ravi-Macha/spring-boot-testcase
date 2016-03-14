/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.libbo;

/**
 *
 * @author Alessandro Falappa
 */
public class LibClient {

    private int port;

    public LibClient(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
