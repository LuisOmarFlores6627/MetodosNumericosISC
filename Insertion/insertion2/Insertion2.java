package insertion2;

public class Insertion2 {

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
        int[] arr = {10, 7, 8, 3, 1};

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
10 7 8 3 1 
Lista ordenada:
1 3 7 8 10   
*/