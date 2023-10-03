public class BookSorting {
    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] bookHeightList ={10, 15, 14, 23, 12};

        System.out.println("Array Before Bubble Sort");
        for (int j : bookHeightList) {
            System.out.print(j + " ");
        }
        System.out.println();

        int[] sortedBookList = bubbleSort(bookHeightList);
        System.out.println("Array After Bubble Sort");
        for (int j : sortedBookList) {
            System.out.print(j + " ");
        }
    }
}