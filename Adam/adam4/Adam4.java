package adam4;
public class Adam4 {
    public static void main(String[] args) {
        // Proponer valores directamente en el código
        double t0 = 0.0;  // Tiempo inicial
        double y0 = 1.0;  // Valor inicial de la solución
        double h = 0.1;   // Tamaño del paso
        int n = 20;       // Número de pasos

        // Inicializar arrays para almacenar los valores de tiempo y solución
        double[] t = new double[n + 1];
        double[] y = new double[n + 1];
        t[0] = t0;
        y[0] = y0;
 
        // Usar RK4 para los primeros 4 pasos
        for (int i = 0; i < 3; i++) {
            t[i + 1] = t[i] + h;
            double k1 = h * f(t[i], y[i]);
            double k2 = h * f(t[i] + h / 2, y[i] + k1 / 2);
            double k3 = h * f(t[i] + h / 2, y[i] + k2 / 2);
            double k4 = h * f(t[i] + h, y[i] + k3);
            y[i + 1] = y[i] + (k1 + 2 * k2 + 2 * k3 + k4) / 6;
        }

        // Aplicar el método de Adams-Bashforth para los pasos restantes
        for (int i = 3; i < n; i++) {
            t[i + 1] = t[i] + h;
            y[i + 1] = y[i] + h / 24 * (55 * f(t[i], y[i]) - 59 * f(t[i - 1], y[i - 1]) + 37 * f(t[i - 2], y[i - 2]) - 9 * f(t[i - 3], y[i - 3]));
        }

        // Imprimir los resultados
        System.out.println("Resultados:");
        for (int i = 0; i <= n; i++) {
            System.out.printf("t = %.4f, y = %.4f%n", t[i], y[i]);
        }
    }

    // Definir la EDO
    public static double f(double t, double y) {
        return -2 * t * y;
    }
}
/*
  Salida en pantalla:
  Resultados:
t = 0.0000, y = 1.0000
t = 0.1000, y = 0.9900
t = 0.2000, y = 0.9608
t = 0.3000, y = 0.9139
t = 0.4000, y = 0.8522
t = 0.5000, y = 0.7790
t = 0.6000, y = 0.6979
t = 0.7000, y = 0.6129
t = 0.8000, y = 0.5277
t = 0.9000, y = 0.4452
t = 1.0000, y = 0.3682
t = 1.1000, y = 0.2985
t = 1.2000, y = 0.2372
t = 1.3000, y = 0.1847  
t = 1.4000, y = 0.1409
t = 1.5000, y = 0.1054
t = 1.6000, y = 0.0773
t = 1.7000, y = 0.0555
t = 1.8000, y = 0.0391
t = 1.9000, y = 0.0270
t = 2.0000, y = 0.0183 
*/

