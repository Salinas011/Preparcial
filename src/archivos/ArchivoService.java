package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class ArchivoService {

    public static void crearArchivo(String nombreArchivo) {
 
        // Se crea un objeto File que representa el archivo
        File archivo = new File(nombreArchivo);
 
        try {
            // Intenta crear el archivo físicamente
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado correctamente.");

                try (FileWriter writer = new FileWriter(archivo)) {

                    writer.write("Nombre,Edad,Nota\n");
                    writer.write("Ana,21,89\n");
                    writer.write("Luis,23,92\n");
                    writer.write("Marta,20,95\n");
                    writer.write("Carlos,22,85\n");

                    System.out.println("Registros iniciales agregados.");
                }
            } else {
                // Si ya existía, simplemente lo informa
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            // En caso de error al crear el archivo
            System.out.println("Ocurrió un error al crear el archivo.");
        }
    }

    public static void leerArchivo(String nombreArchivo) {
 
        try {
            // Lee todas las líneas y las guarda en una lista
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
 
            System.out.println("Contenido actual del archivo:");
 
            // Recorre cada línea leída
            for (String linea : lineas) {
                // La imprime en pantalla
                System.out.println(linea);
            }
 
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
