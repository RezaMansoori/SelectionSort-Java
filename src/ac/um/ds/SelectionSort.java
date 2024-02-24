package ac.um.ds;

public class SelectionSort<T extends Comparable<T>> implements ISort<T> {
    @Override
    public void Sort(T[] A) {
        T minItem, temp;
        int minItemIndex;
        for (int i = 0; i < A.length; i++) {
            minItem = A[i];
            minItemIndex = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j].compareTo(minItem) == -1) {
                    minItem = A[j];
                    minItemIndex = j;
                }
            }
            temp = A[minItemIndex];
            A[minItemIndex] = A[i];
            A[i] = temp;
        }
    }
}
