package merge5;

public class Merge5 {
    
    public static void main(String[] args) {
        // Arreglo predefinido para ordenar
        int[] arr = {521, 2, 9, 1, 7, 322, 6, 4, 8};

        // Imprimir el arreglo original
        System.out.println("Arreglo original:");
        printArray(arr); 
        
        // Llamar a la función mergeSort para ordenar el arreglo
        mergeSort(arr);
        
        // Imprimir el arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        // Llamada inicial para ordenar el arreglo completo
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;

            // Ordenar recursivamente las dos mitades
            mergeSort(arr, inicio, medio);
            mergeSort(arr, medio + 1, fin);

            // Combinar las mitades ordenadas
            merge(arr, inicio, medio, fin);
        }
    }

    public static void merge(int[] arr, int inicio, int medio, int fin) {
        int[] temp = new int[arr.length];
        int izquierda = inicio;
        int derecha = medio + 1;
        int indice = inicio;

        // Combinar las dos mitades en el arreglo temporal
        while (izquierda <= medio && derecha <= fin) {
            if (arr[izquierda] <= arr[derecha]) {
                temp[indice++] = arr[izquierda++];
            } else {
                temp[indice++] = arr[derecha++];
            }
        }

        // Copiar los elementos restantes de la mitad izquierda
        while (izquierda <= medio) {
            temp[indice++] = arr[izquierda++];
        }

        // Copiar los elementos restantes de la mitad derecha
        while (derecha <= fin) {
            temp[indice++] = arr[derecha++];
        }

        // Copiar el contenido del arreglo temporal de vuelta al arreglo original
        for (int i = inicio; i <= fin; i++) {
            arr[i] = temp[i];
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
/*
  Salida en pantalla:
Arreglo original:
521 2 9 1 7 322 6 4 8 

Arreglo ordenado:   
1 2 4 6 7 8 9 322 521 
*/
