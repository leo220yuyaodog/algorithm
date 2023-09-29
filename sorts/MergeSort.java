package sorts;

import java.util.Arrays;

/**
 * @author : leo220yuyaodog
 * @date : 2023-09-27 9:13
 */
public class MergeSort {
    public static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        mergeSort(nums, left, left + (right - left) / 2);
        mergeSort(nums, left + (right - left) / 2 + 1, right);
        merge(nums, left, right);
    }

    public static void merge(int[] nums, int left, int right) {
        int[] temp = Arrays.copyOfRange(nums, left, right + 1);
        int mid = left + (right - left) / 2;
        int i = 0, j = mid + 1 - left, k = left;

        while (i <= mid - left && j <= right - left) {
            if (temp[i] <= temp[j]) {
                nums[k++] = temp[i++];
            } else {
                nums[k++] = temp[j++];
            }
        }
        while (i <= mid - left) {
            nums[k++] = temp[i++];
        }
        while (j <= right - left) {
            nums[k++] = temp[j++];
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 4, 1, 2, 6};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
