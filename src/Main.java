import gestor.Gestor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

import static gestor.Gestor.*;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    Gestor gestor = new Gestor();
    public static void mostrarMenu() {
        out.println("\u001B[31m"+"\u001B[40m" +"***** Bienvenido *****"+"\n"
        +"\u001B[34m"+"1. Calsado Cordon"+"\n"
        +"\u001B[34m"+"2. Calsado Velcro"+"\n"
        +"\u001B[34m"+"3. Calsado Tacon"+"\n"
        +"\u001B[34m"+"4. Calsado Almohadilla"+"\n"
        +"\u001B[33m"+"s. salir" +"\u001B[0m"
                +"\u001B[40m");
    }
    public static String ejecutarOpcion(String opcion) throws Exception {
        String mensaje = " ";
        switch (opcion) {
            case "1":
                mensaje = CalzadoConCordon();
                break;
            case "2":
                mensaje = CalzadoConVelcro();
                break;
            case "3":
                mensaje = CalzadoConTacon();
                break;
            case "4":
                mensaje = CalzadoConAlmohadilla();
                break;
            case "s":
                out.println("Cerrando sesión");
        }
        return mensaje;
    }
    public static void main(String[] args) throws Exception {
        String opcion = "";
        while(!opcion.equals("s")) {
            mostrarMenu();
            System.out.print("\u001B[36m"+"\u001B[40m"+"Ingrese su opción deseada: ");
            opcion = in.readLine();
            ejecutarOpcion(opcion);

            String mensaje = ejecutarOpcion(opcion);
            System.out.println(mensaje);
        }
    }
}
