package ordenamiento;

public class MezclaDirecta {

    public static void ejecutarEjemplo() {

        int[] bloque1 = {89, 92};   // Bloque ordenado
        int[] bloque2 = {85, 95};   // Bloque ordenado

        int[] resultado = fusionar(bloque1, bloque2);

        System.out.println("Resultado de la mezcla directa:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] fusionar(int[] bloque1, int[] bloque2) {

        int[] resultado = new int[bloque1.length + bloque2.length];

        int i = 0, j = 0, k = 0;

        while (i < bloque1.length && j < bloque2.length) {
            if (bloque1[i] <= bloque2[j]) {
                resultado[k++] = bloque1[i++];
            } else {
                resultado[k++] = bloque2[j++];
            }
        }

        while (i < bloque1.length) {
            resultado[k++] = bloque1[i++];
        }

        while (j < bloque2.length) {
            resultado[k++] = bloque2[j++];
        }

        return resultado;
    }
}