package adam2;
public class Adam2 {
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
        return t + y;
    }
}

/*
  Salida en pantalla:
   Resultados:
t = 0.0000, y = 1.0000
t = 0.1000, y = 1.1103
t = 0.2000, y = 1.2428
t = 0.3000, y = 1.3997
t = 0.4000, y = 1.5836
t = 0.5000, y = 1.7974
t = 0.6000, y = 2.0442
t = 0.7000, y = 2.3275
t = 0.8000, y = 2.6510
t = 0.9000, y = 3.0191  
t = 1.0000, y = 3.4364
t = 1.1000, y = 3.9082
t = 1.2000, y = 4.4401
t = 1.3000, y = 5.0384
t = 1.4000, y = 5.7101
t = 1.5000, y = 6.4631
t = 1.6000, y = 7.3057
t = 1.7000, y = 8.2474
t = 1.8000, y = 9.2988
t = 1.9000, y = 10.4711
t = 2.0000, y = 11.7774
*/