package org.usach.shoppingcart;

public abstract class Producto {
    private static int lastID;
    protected int id;
    protected String nombre;
    protected int precio;


    // Una clase abstracta no puede ser instanciada
    // La clase concreta, que lo implementa, puede ser instanciada
    public Producto(String nombre, int precio) {
        this.setNombre(nombre);
        this.setPrecio(precio);
        lastID++;
        this.id = lastID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isBlank())
            this.nombre = nombre;
        else
            this.nombre = "Sin Nombre";
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (precio >= 0)
            this.precio = precio;

    }

    public int getID() {
        return this.id;
    }

    // Al ser una clase abstracta, puede tener métodos abstractos
    //public abstract void metodoAbstracto();

    @Override
    public boolean equals(Object o) {
        // Pregunta si el objeto o es precisamente el objeto con el nos estamos comparando (o el mismo objeto) this.
        // Se compara la identidad del objeto
        if (this == o)
            return true;

        if ((o == null) || (getClass() != o.getClass()))
            return false;

        Producto otherProduct = (Producto) o;

        return this.nombre.equals(otherProduct.nombre);

    }
}

