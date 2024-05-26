package insertion4;

public class Insertion4 {

    // Método para realizar la ordenación por inserción
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Desplazar los elementos de arr[0..i-1], que son mayores que la clave, a una posición adelante
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Método para imprimir la lista
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Proporcionar los datos directamente
        int[] arr = {8, 5, 2, 9, 5, 6, 3};

        // Imprimir la lista original
        System.out.println("Lista original:");
        printArray(arr);

        // Ordenar la lista usando el método de ordenación por inserción
        insertionSort(arr);

        // Imprimir la lista ordenada
        System.out.println("Lista ordenada:");
        printArray(arr);
    }
}
/*
  Salida en pantalla:
Lista original:
8 5 2 9 5 6 3 
Lista ordenada:  
2 3 5 5 6 8 9 
*/
