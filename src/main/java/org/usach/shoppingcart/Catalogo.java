package org.usach.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Producto> productos = new ArrayList<>();

    public void add(Producto p) {
        if (!productos.contains(p))
            this.productos.add(p);
    }

}