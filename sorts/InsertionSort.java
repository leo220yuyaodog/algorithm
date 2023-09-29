package sorts;

import java.util.Arrays;

class InsertionSort {
    public static void sort(int[] a) {
        if (a == null || a.length <= 1) {
            return;
        }
        // 从第二个元素开始，将元素插入到前面已经排好序的序列中
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;

            while (j >= 0 && value < a[j]) {
                // 将大于value的元素向后移动
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 4, 1, 2, 6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}

