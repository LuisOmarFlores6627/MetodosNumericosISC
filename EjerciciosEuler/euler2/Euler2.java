package euler2;
import java.util.ArrayList;
import java.util.List;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Euler2 {
 
    public static void main(String[] args) {
        // Nuevos valores predefinidos
        String funcion = "x * y"; // Función para y' = f(x, y)
        double x0 = 0.0; // Valor inicial de x
        double y0 = 1.0; // Valor inicial de y
        double h = 0.2; // Tamaño del paso
        int n = 5; // Número de pasos

        List<double[]> resultados = metodoEuler(funcion, x0, y0, h, n);

        System.out.println("Resultados:");
        for (double[] par : resultados) {
            System.out.printf("x: %.4f, y: %.4f%n", par[0], par[1]);
        }
    }

    public static List<double[]> metodoEuler(String funcion, double x0, double y0, double h, int n) {
        List<double[]> resultados = new ArrayList<>();
        double x = x0;
        double y = y0;
        resultados.add(new double[]{x, y});

        for (int i = 0; i < n; i++) {
            y += h * evaluarFuncion(funcion, x, y);
            x += h;
            resultados.add(new double[]{x, y});
        }

        return resultados;
    }

    public static double evaluarFuncion(String funcion, double x, double y) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        funcion = funcion.replace("x", Double.toString(x)).replace("y", Double.toString(y));
        try {
            return (double) engine.eval(funcion);
        } catch (ScriptException e) {
            System.out.println("Error al evaluar la función: " + e.getMessage());
            return 0;
        }
    }
}
/*
  Salida en pantalla:
  Resultados:
x: 0.0000, y: 1.0000
x: 0.2000, y: 1.0000
x: 0.4000, y: 1.0400
x: 0.6000, y: 1.1232
x: 0.8000, y: 1.2580 
x: 1.0000, y: 1.4593 
*/
