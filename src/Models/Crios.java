package Models;

public class Crios {
    private String nombre;
    private String pass;
    private String direccion;
    private int telefono;
    private static Pedido pedido;

    // Constructor

    public Crios(String nombre, String pass, String direccion, int telefono) {
        this.nombre = nombre;
        this.pass = pass;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpass() {
        return pass;
    }

    public void setpass(String pass) {
        this.pass = pass;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public static Pedido getPedido() {
        return pedido;
    }


    //otros metodos

    public String pintarcrio(){
        return "=== Tus Datos === \n "+
               "- Direccion: " + getNombre() + "\n" +
                "- Telefono " + getTelefono() + "\n"+
                "- Lista de regalos: * \n";
     //           Pedido.pintaPedido();
    }

    @Override
    public String toString() {
        return "crios{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + pass + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
