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
        out.println("1. Calsado Cordon");
        out.println("2. Calsado Velcro");
        out.println("3. Calsado Tacon");
        out.println("4. Calsado Almohadilla");
        out.println("s. salir");
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
            System.out.println("Ingrese la opción deseada: ");
            opcion = in.readLine();
            ejecutarOpcion(opcion);

            String mensaje = ejecutarOpcion(opcion);
            System.out.println(mensaje);
        }
    }
}
