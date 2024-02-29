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
        out.println("1. Calsado Amarillo");
        out.println("2. Calsado Negro ");
        out.println("3. Calsado velcro ");
        out.println("4. Calsado josep");
        out.println("s.salir");
    }
    public static void ejecutarOpcion(String opcion) throws Exception {
        switch (opcion) {
            case "1":
                CalsadoAmarillo();
                break;
            case "2":
                CalsadoNegro();
                break;
            case "3":
                CalsadoVelcroAzul();
                break;
            case "4":
                CalzadoTacon();
                break;
            case "s":
                out.println("Cerrando sesión");
        }
    }
    public static void main(String[] args) throws Exception {
        String opcion = "";
        while(!opcion.equals("s")) {
            mostrarMenu();
            System.out.println("Ingrese la opción deseada: ");
            opcion = in.readLine();
            ejecutarOpcion(opcion);
        }
    }
}
