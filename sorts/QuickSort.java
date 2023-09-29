package sorts;

import java.util.Arrays;

/**
 * @author : leo220yuyaodog
 * @date : 2023-09-27 9:58
 */
public class QuickSort {
    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = partition(nums, left, right);
        quickSort(nums, left, pivotIndex - 1);
        quickSort(nums, pivotIndex + 1, right);
    }

    public static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left, j = left;
        while (j < right) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
        swap(nums, i, right);

        return right;
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 4, 1, 2, 6};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
