package Models;

public class Santa {
    //Atributos de santa

    private String nombre;
    private String pass;

    //Constructor


    public Santa(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }


    // Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
