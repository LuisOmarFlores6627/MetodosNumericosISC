package interlagrange1;

public class InterLagrange1 {

    public static void main(String[] args) 
    {
        // Puntos conocidos (x, y)
        double[] x = {1, 2, 3};
        double[] y = {2, 3, 4};
        
        // Valor para interpolar
        double xInterpolate = 2.5;

        // Calcular el resultado de la interpolación de Lagrange
        double result = lagrangeInterpolation(x, y, xInterpolate);

        // Mostrar el resultado
        System.out.println("El resultado de la interpolación de Lagrange para x = " + xInterpolate + " es: " + result);
    }

    // Método para calcular la interpolación de Lagrange
    public static double lagrangeInterpolation(double[] x, double[] y, double xInterpolate) {
        double result = 0;

        for (int i = 0; i < x.length; i++) {
            double term = y[i];
            for (int j = 0; j < x.length; j++) {
                if (j != i) {
                    term = term * (xInterpolate - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }

        return result;
    }   
}

//---------------Resultado en pantalla--------------------
//El resultado de la interpolación de Lagrange para x = 2.5 es: 3.5 
