public class HeapSort {
    public static void heapMake(int array[], int l, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < l && array[left] > array[largest])
            largest = left;

        if (right < l && array[right] > array[largest])
            largest = right;

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapMake(array, l, largest);
        }
    }

    public static void sort(int array[]) {
        int l = array.length;
        for (int i = l / 2 - 1; i >= 0; i--)
            heapMake(array, l, i);

        for (int i = l - 1; i >= 0; i--) {
            int swap = array[0];
            array[0] = array[i];
            array[i] = swap;

            heapMake(array, i, 0);
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{65, 8, 2, 4, 0, 5, 6, 4, 0, 9};
        sort(arr);
        System.out.println("HeapSort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
