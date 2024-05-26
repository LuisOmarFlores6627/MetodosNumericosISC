package cocktail3;

public class Cocktail3 {
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
        int[] arr = {20, 15, 10, 25, 30, 5, 40, 35};

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
5 10 15 20 25 30 35 40  
*/
