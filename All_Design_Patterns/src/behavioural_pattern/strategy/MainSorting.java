import strategy.*;

public class MainSorting {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        Sorter sorter = new Sorter(new BubbleSort());
        sorter.sortArray(array);
        printArray(array);

        array = new int[]{5, 2, 9, 1, 5, 6};
        sorter.setStrategy(new QuickSort());
        sorter.sortArray(array);
        printArray(array);

        array = new int[]{5, 2, 9, 1, 5, 6};
        sorter.setStrategy(new MergeSort());
        sorter.sortArray(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
