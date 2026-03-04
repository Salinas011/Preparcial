import java.util.Scanner;

import archivos.ArchivoService;
import archivos.AccesoDirectoService;
import ordenamiento.MezclaDirecta;
import ordenamiento.CorridasNaturales;
import recursividad.ContadorNotas;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n========= MENÚ PRINCIPAL =========");
            System.out.println("1. Verificar o crear archivo de estudiantes");
            System.out.println("2. Mostrar contenido completo del archivo");
            System.out.println("3. Mostrar una línea específica (Acceso directo)");
            System.out.println("4. Ejecutar mezcla directa");
            System.out.println("5. Detectar corridas naturales");
            System.out.println("6. Contar estudiantes con nota >= 90 (Recursivo)");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Debe ingresar un número válido.");
                sc.next();
                opcion = -1;
                continue;
            }

            switch (opcion) {

                case 1:
                    ArchivoService.crearArchivo("data/estudiantes.txt");
                    break;

                case 2:
                    ArchivoService.leerArchivo("data/estudiantes.txt");
                    break;

            case 3:
                    System.out.print("Ingrese número de línea: ");
                    int linea = sc.nextInt();
                    AccesoDirectoService.mostrarLinea("data/estudiantes.txt", linea);
                    break;

                case 4:
                    MezclaDirecta.ejecutarEjemplo();
                    break;

                case 5:
                    CorridasNaturales.ejecutarEjemplo();
                    break;

                case 6:
                    ContadorNotas.ejecutarEjemplo();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);

        sc.close();
    }
}