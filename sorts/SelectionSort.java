package sorts;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] a) {
        if (a == null || a.length <= 1) {
            return;
        }
        // 从第一个元素开始，从剩余的元素中找到最小的元素，将其与第一个元素交换
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            // 找到最小的元素
            for (int j = i+1; j<a.length;j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            // 交换
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 4, 1, 2, 6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
