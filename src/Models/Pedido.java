package Models;

public class Pedido {
    //Atributos del Pedido
    Regalo regalo1 = null;
    Regalo regalo2 = null;
    Regalo regalo3 = null;

    public Pedido(){
        regalo1 = null;
        regalo2 = null;
        regalo3 = null;
    }
    public Pedido(Regalo regalo1, Regalo regalo2, Regalo regalo3) {
        this.regalo1 = regalo1;
        this.regalo2 = regalo2;
        this.regalo3 = regalo3;
    }
    public Pedido(Pedido pedido){}


    public Regalo getRegalo1() {
        return regalo1;
    }

    public void setRegalo1(Regalo regalo1) {
        this.regalo1 = regalo1;
    }

    public Regalo getRegalo2() {
        return regalo2;
    }

    public void setRegalo2(Regalo regalo2) {
        this.regalo2 = regalo2;
    }

    public Regalo getRegalo3() {
        return regalo3;
    }

    public void setRegalo3(Regalo regalo3) {
        this.regalo3 = regalo3;
    }

    public static String pintaPedido() {
        return "";
    }
    public String pintaSanta(){
        String salida = "";
        return salida;

    }


    public boolean entradaRegalo(String nombreRegalo, float precio, String esPara) {
        if(getRegalo1() == null){
            this.regalo1 = new Regalo(nombreRegalo,precio,esPara);
            return true;
        }
        if(getRegalo2() == null){
            this.regalo2 = new Regalo(nombreRegalo, precio, esPara);
            return true;
        }
        if(getRegalo3() == null){
            this.regalo3 = new Regalo(nombreRegalo, precio, esPara);
            return true;
        }
        return false;
    }
}
