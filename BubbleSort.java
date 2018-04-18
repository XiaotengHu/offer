package offer;

import java.util.Arrays;

public class BubbleSort {
public static void bubbleSort(int[] data){
	if(data.length == 0){
		return;
	}
	for(int i = 0; i<data.length-1;i++){
		for(int j= 0; j<data.length-i-1;j++){
			if(data[j]>data[j+1]){
			int temp = data[j+1];
			data[j+1] = data[j];
			data[j] = temp;
			}
		}
	}
}
public static void main(String[] args) {
	int[] data = {9,7,6,7,65,3,4,2};
	bubbleSort(data);
	System.out.println(Arrays.toString(data));
}
}
