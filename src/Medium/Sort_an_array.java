package Medium;

public class Sort_an_array {

    public static void main(String[] args) {

    }

    public int[] sortArray(int[] nums) {
        partition(0, nums.length - 1, nums);
        return nums;
    }

    private void mergeSort(int left, int mid, int right, int[] arr) {
        int[] L = new int[mid - left + 1];
        int[] R = new int[right - mid];
        for (int i = 0; i < L.length; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < R.length; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < L.length && j < R.length) {
            if (L[i] > R[j]) {
                arr[k] = R[j];
                j++;
            } else {
                arr[k] = L[i];
                i++;
            }
            k++;
        }

        while (i < L.length) {
            arr[k] = L[i];
            k++;
            i++;
        }

        while (j < R.length) {
            arr[k] = R[j];
            k++;
            j++;
        }
    }

    private void partition(int left, int right, int[] arr) {
        int l = left, r = right;
        if (l < r) {
            int mid = (left + right) / 2;
            partition(l, mid, arr);
            partition(mid + 1, r, arr);
            mergeSort(l, mid, r, arr);
        }
    }
}
