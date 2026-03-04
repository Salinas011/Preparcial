package ordenamiento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CorridasNaturales {

    public static void ejecutarEjemplo() {

        String ruta = "data/estudiantes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            String lineaAnterior = br.readLine();

            if (lineaAnterior == null) {
                System.out.println("El archivo está vacío.");
                return;
            }

            System.out.println("Corrida 1:");
            System.out.println(lineaAnterior);

            double notaAnterior = obtenerNota(lineaAnterior);
            int numeroCorrida = 1;

            while ((linea = br.readLine()) != null) {

                double notaActual = obtenerNota(linea);

                if (notaActual < notaAnterior) {
                    numeroCorrida++;
                    System.out.println("\nCorrida " + numeroCorrida + ":");
                }

                System.out.println(linea);

                notaAnterior = notaActual;
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static double obtenerNota(String linea) {
        String[] partes = linea.split(",");
        return Double.parseDouble(partes[1].trim());
    }
}