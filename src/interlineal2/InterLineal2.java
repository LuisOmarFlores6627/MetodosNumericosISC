package interlineal2;

public class InterLineal2 {

    // Método para calcular la interpolación lineal
    public static double interpolacionLineal(double x0, double y0, double x1, double y1, double x) {
        return y0 + ((y1 - y0) / (x1 - x0)) * (x - x0);
    }

    public static void main(String[] args) {
        // Valores proporcionados
        double x0 = 1.0;
        double y0 = 2.0;
        double x1 = 3.0;
        double y1 = 6.0;
        double x = 2.8;

        // Calcular la interpolación lineal
        double y = interpolacionLineal(x0, y0, x1, y1, x);

        // Mostrar el resultado
        System.out.println("El valor interpolado de y para x=" + x + " es: " + y);
    }
} 

//--------------Salida en pantalla----------------- 
//El valor interpolado de y para x=2.8 es: 5.6
