import Models.Crios;
import Models.Pedido;
import Models.Santa;
import Models.Usuarios;
import Utils.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        boolean sesionIniciada = false;
        String user = "", pass = "";
        Usuarios usuario = new Usuarios();
        Pedido pedido = new Pedido();

        do{
            System.out.print("""
                    ====== FERNANELF ======
                     .-""-.
                     /,..___\\
                    () {_____}
                      (/-@-@-\\)
                      {`-=^=-'}
                      {  `-'  } 
                       {     }
                        `---'
                    
                    Menú principal:
                    1. Iniciar sesión
                    2. Escribir la carta a Santa
                    3. Salir
                    Introduce la opción deseada:\s""");
            op = Integer.parseInt(sc.nextLine());

            switch(op){
                case 1:
                    System.out.print("Introduce nombre:");
                    user = sc.nextLine();
                    System.out.print("Introduce clave:");
                    pass = sc.nextLine();
                    sesionIniciada=usuario.inicioSesion(user,pass);
                    Utils.pulsaEnter();
                    break;
                case 2:
                    String direccion;
                    int movil;
                    System.out.print("Introduce tu nombre: ");
                    user = sc.nextLine();
                    System.out.print("Introduce clave: ");
                    pass = sc.nextLine();
                    System.out.print("Introduce tu dirección: ");
                    direccion = sc.nextLine();
                    System.out.print("Introduce tu movil: ");
                    movil = Integer.parseInt(sc.nextLine());
                    System.out.println(usuario.nuevoNino(user,pass,direccion,movil)
                            ? "Preparado para recibir tu carta"
                            : "Santa no puede recibir más cartas");
                    Utils.pulsaEnter();
                    break;
                case 3:
                    System.out.println("Adios");
                    Utils.pulsaEnter();
                    break;
                default:
                    System.out.println("Opción no disponible");
                    Utils.pulsaEnter();
                    break;
            };

            if(sesionIniciada) {
                if (user.equals("Santa")){
                    //System.out.print(pedido.pintaSanta());
                    System.out.println("Santa");
                }
                else {
                    int opcion;
                    do{
                        String nombreRegalo = "", respuesta = "", esPara = "";
                        int precio;
                        System.out.print(usuario.pintaMenu(user));
                        opcion = Integer.parseInt(sc.nextLine());
                        switch (opcion){
                            case 1:
                                break;
                            case 2:
                                System.out.print("Introduce nombre regalo: ");
                                nombreRegalo = sc.nextLine();
                                System.out.print("Introduce precio: ");
                                precio = Integer.parseInt(sc.nextLine());
                                do{
                                    System.out.print("¿Es para ti?");
                                    respuesta = sc.nextLine();
                                    switch (respuesta){
                                        case "Si":
                                            esPara = user;
                                            break;
                                        case "No":
                                            System.out.println("Es para: ");
                                            esPara = sc.nextLine();
                                            break;
                                        default:
                                            break;
                                    };
                                    System.out.println(usuario.hacerPedido(user,nombreRegalo,precio,esPara));
                                }while (respuesta != "Si" || respuesta != "No");


                                break;
                            case 3:
                                break;
                            case 4:
                                System.out.println("Adiós");
                                break;
                            default:
                                break;
                        };
                    }while (opcion!=4);

                }
            }




        } while (op != 3);


    }
}