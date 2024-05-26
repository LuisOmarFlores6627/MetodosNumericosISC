package cocktail5;

public class Cocktail5 {
    public static void cocktailShakerSort(int[] arr) {
        int n = arr.length;
        boolean swapped = true;
        int start = 0;
        int end = n - 1;

        while (swapped) { 
            swapped = false;

            // Recorrido hacia adelante
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Intercambio de elementos
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            // Si no se realizó ningún intercambio, la lista está ordenada
            if (!swapped) {
                break;
            }

            // Recorrido hacia atrás
            swapped = false;
            end--;

            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    // Intercambio de elementos
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            // Aumentar el inicio del recorrido
            start++;
        }
    }

    public static void main(String[] args) {
        // Datos proporcionados automáticamente
        int[] arr = {32, 24, 5, 77, 18, 65, 43, 12, 87, 30};

        // Llamar al método de ordenamiento
        cocktailShakerSort(arr);

        // Imprimir el array ordenado
        System.out.println("Array ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
/*
  Salida en pantalla:
Array ordenado:
5 12 18 24 30 32 43 65 77 87  
*/
