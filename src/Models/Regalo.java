package Models;

public class Regalo {
    //Atributos

    String nombre;
    float precio;
    String esPara;

    public Regalo(String nombre, float precio, String esPara) {
        this.nombre = nombre;
        this.precio = precio;
        this.esPara = esPara;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getEsPara() {
        return esPara;
    }

    public void setEsPara(String esPara) {
        this.esPara = esPara;
    }

    public void introRegalo() {

    }

}
