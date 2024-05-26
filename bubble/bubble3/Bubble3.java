package bubble3;

public class Bubble3 {
    public static void main(String[] args) {
        // Proponer un nuevo conjunto de datos
        int[] arr = {78, 55, 45, 98, 13, 23, 67, 1, 34};
        
        // Imprimir el arreglo original
        System.out.println("Arreglo original:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Ordenar el arreglo usando Bubble Sort
        bubbleSort(arr);
        
        // Imprimir el arreglo ordenado
        System.out.println("El arreglo ordenado es:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Si no hubo intercambios en la pasada, el arreglo ya está ordenado
            if (!swapped) {
                break;
            }
        }
    }
}
/*  
   Salida en pantalla:
   Arreglo original:
  78 55 45 98 13 23 67 1 34 
  El arreglo ordenado es:
  1 13 23 34 45 55 67 78 98
*/