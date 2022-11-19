package org.usach.shoppingcart;

public class Cliente {
    private String username;
    private String password;

    // Composición
    // Ciclos de vida no amarrados
    // Cliente se COMPONE (TIENE UN) Carrito
    // Cliente <=> ----- Carrito
    // El rombo pintado va del lado de la clase que CONTIENE a la otra clase
    private ICarrito mycarrito = new Carrito();

    public Cliente(String username, String password) {
        // Se puede utilizar la capa set para esto (se sugiere hacer esto)
        this.username = username;
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        if (password.length() >= 8)     // Validación
            this.password = password;
        else
            this.password = "12345678"; // Default password
    }

    @Override
    public boolean equals(Object o) {
        // Pregunta si el objeto o es precisamente el objeto con el nos estamos comparando (o el mismo objeto) this.
        // se estará comparando la identidad del objeto
        if (this == o)
            return true;

        if ((o == null) || (getClass() != o.getClass()))
            return false;

        Cliente otherCliente = (Cliente) o;

        return this.username.equals(otherCliente.username);

    }
}
