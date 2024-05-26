package merge1;

public class Merge1 {
    
    public static void main(String[] args) {
        // Arreglo predefinido para ordenar
        int[] arr = {12, 11, 13, 5, 6, 7};

        // Llamar a la función mergeSort para ordenar el arreglo
        mergeSort(arr);
        
        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        // Dividir el arreglo en mitades
        int mid = arr.length / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[arr.length - mid];
        System.arraycopy(arr, 0, leftHalf, 0, mid);
        System.arraycopy(arr, mid, rightHalf, 0, arr.length - mid);

        // Llamadas recursivas para ordenar cada mitad
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Combinar las dos mitades ordenadas
        merge(arr, leftHalf, rightHalf);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int leftIndex = 0, rightIndex = 0, currentIndex = 0;

        // Comparar elementos de las dos mitades y agregar al arreglo principal
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                arr[currentIndex++] = left[leftIndex++];
            } else {
                arr[currentIndex++] = right[rightIndex++];
            }
        }

        // Agregar los elementos restantes de la mitad izquierda, si los hay
        while (leftIndex < left.length) {
            arr[currentIndex++] = left[leftIndex++];
        }

        // Agregar los elementos restantes de la mitad derecha, si los hay
        while (rightIndex < right.length) {
            arr[currentIndex++] = right[rightIndex++];
        }
    }
}
/*
  Salida en pantalla:
Arreglo ordenado:
5 6 7 11 12 13  
*/
