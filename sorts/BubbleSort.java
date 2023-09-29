package sorts;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] a) {
        if (a == null || a.length <= 1) {
            return;
        }
        // 从第一个元素开始，比较相邻的两个元素，将较大的元素交换到后面
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 4, 1, 2, 6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
