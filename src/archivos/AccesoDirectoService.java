package archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AccesoDirectoService {
     public static void mostrarLinea(String nombreArchivo, int numeroLinea) {

        if (numeroLinea <= 0) {
            System.out.println("El número de línea debe ser mayor que 0.");
            return;
        }

        try {

            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));

            int indice = numeroLinea - 1;

            if (indice < lineas.size()) {
                System.out.println("Línea " + numeroLinea + ": " + lineas.get(indice));
            } else {
                System.out.println("La línea solicitada no existe.");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

       
    }
}
