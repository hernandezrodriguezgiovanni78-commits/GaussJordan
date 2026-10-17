public class GaussJordan {

    /**
     * Método que realiza la triangulación superior reutilizando la lógica anterior.
     * @param matriz Matriz aumentada [A | b].
     */
    public static void eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matriz[j][i] / matriz[i][i];
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }

    /**
     * Método que completa el proceso de Gauss-Jordan:
     * 1. Llama a la triangulación superior.
     * 2. Normaliza los pivotes a 1 y ejecuta el barrido superior para obtener la matriz identidad.
     * @param matriz Matriz aumentada [A | b].
     */
    public static void resolverGaussJordan(double[][] matriz) {
        int n = matriz.length;

        // Paso 1: Aplicar triangulación superior previa
        eliminacionGaussiana(matriz);

        // Paso 2: Normalización de pivotes y barrido superior (de abajo hacia arriba)
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];

            // Normalizar la fila actual para que el pivote sea 1
            for (int k = i; k <= n; k++) {
                matriz[i][k] /= pivote;
            }

            // Anular los elementos superiores de la columna actual
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }
}