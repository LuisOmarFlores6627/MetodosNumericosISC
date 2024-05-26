package intercua4;

public class InterCua4 {

    public static void main(String[] args) 
    {
          // Valores proporcionados
        double x1 = -2.0;
        double x2 = 0.0;
        double x3 = 3.0;
        double fx1 = 4.0;
        double fx2 = 0.0;
        double fx3 = 9.0;
        double x = 1.0; // Valor de x para interpolar

        // Calcular interpolación cuadrática
        double resultado = interpolarCuadratica(x1, x2, x3, fx1, fx2, fx3, x);
        System.out.println("El resultado de la interpolación cuadrática en x=" + x + " es: " + resultado);
    }

    public static double interpolarCuadratica(double x1, double x2, double x3, double fx1, double fx2, double fx3, double x) {
        double L1 = ((x - x2) * (x - x3)) / ((x1 - x2) * (x1 - x3));
        double L2 = ((x - x1) * (x - x3)) / ((x2 - x1) * (x2 - x3));
        double L3 = ((x - x1) * (x - x2)) / ((x3 - x1) * (x3 - x2));

        double resultado = (fx1 * L1) + (fx2 * L2) + (fx3 * L3);
        return resultado;
    }   
}

//--------Resultado en pantalla----------
//El resultado de la interpolación cuadrática en x=1.0 es: 1.0 
