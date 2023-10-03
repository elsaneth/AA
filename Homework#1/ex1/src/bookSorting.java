public class bookSorting {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            for (int k : arr) {
                System.out.print(k + " ");
            }
            for (int j = 1; j < (arr.length - i); j++) {
                System.out.println("Mitmes " + j);
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                for (int k : arr) {
                    System.out.print(k + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={3,60,35,2,45,320,5};

        System.out.println("Array Before Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        bubbleSort(arr);//sorting array elements using bubbˆRle sort

        System.out.println("Array After Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}