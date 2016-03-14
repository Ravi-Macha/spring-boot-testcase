/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.libbo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alessandro Falappa
 */
public class LibServer {

    private final String id;
    private List<Libber> libbers = new ArrayList<>();

    public LibServer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Libber> getLibbers() {
        return libbers;
    }

    public void registerLibber(Libber lib) {
        libbers.add(lib);
    }
}
