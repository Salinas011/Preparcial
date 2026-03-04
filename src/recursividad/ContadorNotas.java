package recursividad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorNotas {

    public static void ejecutarEjemplo() {

        String ruta = "data/estudiantes.txt";
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(",");
                double nota = Double.parseDouble(partes[1].trim());

                if (nota >= 90) {
                    contador++;
                }
            }

            System.out.println("Cantidad de estudiantes con nota >= 90: " + contador);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}