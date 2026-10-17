public class Lanzador_GaussJordan {
    public static void main(String[] args) {
        // 1. Mandamos llamar a la función que nos entrega la matriz aumentada [A | b]
        double[][] matriz = defmatrizz.defmatriz();

        // 2. Aplicar el método de Gauss-Jordan (Triangulación + Normalización + Barrido Superior)
        GaussJordan.resolverGaussJordan(matriz);

        // 3. Imprimir resultados finales de manera limpia desde la matriz identidad resultante
        System.out.println("Soluciones del sistema por el método de Gauss-Jordan:");
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + matriz[i][n]);
        }
    }
}