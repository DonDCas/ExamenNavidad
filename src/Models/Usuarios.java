package Models;

public class Usuarios {

    private Santa santa;
    private Crios crio1;
    private Crios crio2;
    private Crios crio3;
    private Crios crio4;
    private Crios crio5;

    private Pedido pedido1;
    private Pedido pedido2;
    private Pedido pedido3;
    private Pedido pedido4;
    private Pedido pedido5;

    // Constructor

    public Usuarios() {
        //crio1 = null;
        crio1 = new Crios("Javi", "1234", "asdf", 1234);
        crio2 = null;
        crio3 = null;
        crio4 = null;
        crio5 = null;
        santa = new Santa("Santa","1234");
        pedido1 = null;
        pedido2 = null;
        pedido3 = null;
        pedido4 = null;
        pedido5 = null;

    }

    //Getter y Setter


    public Santa getSanta() {
        return santa;
    }

    public void setSanta(Santa santa) {
        this.santa = santa;
    }

    public Crios getCrio1() {
        return crio1;
    }

    public void setCrio1(Crios crio1) {
        this.crio1 = crio1;
    }

    public Crios getCrio2() {
        return crio2;
    }

    public void setCrio2(Crios crio2) {
        this.crio2 = crio2;
    }

    public Crios getCrio3() {
        return crio3;
    }

    public void setCrio3(Crios crio3) {
        this.crio3 = crio3;
    }

    public Crios getCrio4() {
        return crio4;
    }

    public void setCrio4(Crios crio4) {
        this.crio4 = crio4;
    }

    public Crios getCrio5() {
        return crio5;
    }

    public void setCrio5(Crios crio5) {
        this.crio5 = crio5;
    }

    public boolean inicioSesion(String user, String pass){
        if(user.equals(santa.getNombre())&&pass.equals(santa.getPass())) return true;
        if(crio1 != null && user.equals(crio1.getNombre()) && pass.equals(crio1.getpass())) return true;
        if(crio2 != null && user.equals(crio2.getNombre()) && pass.equals(crio2.getpass())) return true;
        if(crio3 != null && user.equals(crio3.getNombre()) && pass.equals(crio3.getpass())) return true;
        if(crio4 != null && user.equals(crio4.getNombre()) && pass.equals(crio4.getpass())) return true;
        if(crio5 != null && user.equals(crio5.getNombre()) && pass.equals(crio5.getpass())) return true;
        return false;
    }
    public boolean nuevoNino(String user, String pass, String direccion, int movil){
        if(crio1 == null){
            crio1 = new Crios(user, pass, direccion, movil);
            return true;
        }
        if(crio2 == null){
            crio2 = new Crios(user, pass, direccion, movil);
            return true;
        }
        if(crio3 == null) {
            crio3 = new Crios(user, pass, direccion, movil);
            return true;
        }
        if(crio4 == null){
            crio4 = new Crios(user, pass, direccion, movil);
            return true;
        }
        if(crio5 == null){
            crio5 = new Crios(user, pass, direccion, movil);
            return true;
        }
        return false;
    }

    public String pintaMenu(String user){
        String usuario = "";
        String salida = "";
        if (crio1 != null && crio1.getNombre().equals(user)) usuario = crio1.getNombre();
        if (crio2 != null && crio2.getNombre().equals(user)) usuario = crio2.getNombre();
        if (crio3 != null && crio3.getNombre().equals(user)) usuario = crio3.getNombre();
        if (crio4 != null && crio4.getNombre().equals(user)) usuario = crio4.getNombre();
        if (crio5 != null && crio5.getNombre().equals(user)) usuario = crio5.getNombre();
        salida = "Bienvenido a FernanElf " + usuario + "\n"+
                "1. Ver mis datos y mis regalos \n" +
                "2. Añadir un regalo \n" +
                "3. Quitar un regalo \n" +
                "4. Salir \n" +
                "Introduce una opción: \s";
        return salida;
    }
    public String hacerPedido(String user, String nombreRegalo, float precio, String esPara){
        if (crio1 != null && crio1.getNombre().equals(user)) {
            if (pedido1.entradaRegalo(nombreRegalo, precio, esPara)) return "Regalo anotado con éxito!!! Esperemos que Santa te lo traiga";
            else return "No puedes añadir más regalos";
        }
        return "No se que paso";

    }

}
