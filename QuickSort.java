package offer;

import java.util.Arrays;

public class QuickSort {
	public static int parition(int[] data, int low, int high) {
		int pivot = data[low];
		while (low < high) {
			while (low < high && pivot <= data[high])
				--high;
			data[low] = data[high];
			while (low < high && pivot >= data[low])
				++low;
			data[high] = data[low];
		}
		data[low] = pivot;
		return low;
	}

	public static void quickSort(int[] data, int low, int high) {
		if (low < high) {
			int pivotqos = parition(data, low, high);
			quickSort(data, low, pivotqos - 1);
			quickSort(data, pivotqos + 1, high);
		}

	}

	public static void main(String[] args) {
		int[] data = { 8, 7, 1, 3, 4, 3, 2, 1 };
		quickSort(data, 0, data.length - 1);
		System.out.println(Arrays.toString(data));
	}
}
