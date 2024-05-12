package interlineal5;

public class InterLineal5 {

    // Método para calcular la interpolación lineal
    public static double interpolacionLineal(double x0, double y0, double x1, double y1, double x) {
        return y0 + ((y1 - y0) / (x1 - x0)) * (x - x0);
    }

    public static void main(String[] args) {
        // Valores proporcionados
        double x0 = -2.0;
        double y0 = 5.0;
        double x1 = 4.0; 
        double y1 = 13.0;  
        double x = 1.0;

        // Calcular la interpolación lineal
        double y = interpolacionLineal(x0, y0, x1, y1, x);

        // Mostrar el resultado
        System.out.println("El valor interpolado de y para x=" + x + " es: " + y);
    }
}

//----------Salida en pantalla----------
//El valor interpolado de y para x=1.0 es: 9.0