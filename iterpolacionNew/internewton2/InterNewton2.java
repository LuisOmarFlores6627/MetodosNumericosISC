package internewton2;


public class InterNewton2 {

    public static void main(String[] args) 
    {
         // Valores de ejemplo
        int n = 5; // Número de puntos de datos
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0}; // Valores de x
        double[] y = {3.0, 6.0, 11.0, 18.0, 27.0}; // Valores de y
        double valorX = 3.5; // Valor de x para interpolar

        // Calcular el resultado de la interpolación de Newton
        double resultado = interpolacionNewton(x, y, valorX);
        
        // Imprimir el resultado
        System.out.println("El resultado de la interpolación en x=" + valorX + " es y=" + resultado);
    }
    
    // Método para realizar la interpolación de Newton
    public static double interpolacionNewton(double[] x, double[] y, double valorX) {
        int n = x.length;
        double resultado = y[0];
        double[][] tablaDiferenciasDivididas = new double[n][n];
        
        // Calcular las diferencias divididas
        for (int i = 0; i < n; i++) {
            tablaDiferenciasDivididas[i][0] = y[i];
        }
        
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                tablaDiferenciasDivididas[i][j] = (tablaDiferenciasDivididas[i + 1][j - 1] - tablaDiferenciasDivididas[i][j - 1]) / (x[i + j] - x[i]);
            }
        }
        
        // Calcular el resultado interpolado
        for (int i = 1; i < n; i++) {
            double producto = 1.0;
            for (int j = 0; j < i; j++) {
                producto *= (valorX - x[j]);
            }
            resultado += tablaDiferenciasDivididas[0][i] * producto;
        }
        
        return resultado; 
    }    
}

//-------------Salida en pantalla ----------------  
//El resultado de la interpolación en x=3.5 es y=14.25 