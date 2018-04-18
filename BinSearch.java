package offer;

public class BinSearch {
	public static int binSearch(int[] data, int searchNum) {
		if (data.length == 0) {
			return -1;
		}
		int low = 0;
		int high = data.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (data[mid] == searchNum) {
				return mid;
			} else if (data[mid] > searchNum) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return -1;
	}
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7};
		int searchNum = 3;
		int result = binSearch(data,searchNum);
		System.out.println(result);
	}
}
