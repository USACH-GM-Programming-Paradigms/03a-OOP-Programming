package org.usach.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Tienda {


    // Tienda TIENE UN catalogo
    // Composición
    private Catalogo catalogo = new Catalogo();

    // Tienda TIENE clientes
    // Composición
    private List<Cliente> clientes = new ArrayList<>();


    public void addProductoElectrico(String nombre, int precio, int garantia) {
        ProductoElectrico p = new ProductoElectrico(nombre, precio, garantia);
        catalogo.add(p);
    }

    public boolean register(String user, String password) {
        Cliente cliente = new Cliente(user, password);
        if (clientes.contains(cliente))
            return false;

        clientes.add(cliente);
        return true;
    }
}
