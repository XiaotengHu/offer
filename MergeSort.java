package offer;

import java.util.Arrays;

public class MergeSort {
public static void merge(int[] data, int low, int mid, int high){
	int [] temp = new int[high -low +1];
	int left = low;
	int right = mid+1;
	int k = 0;
	while(left <=mid && right <= high){
		if(data[left]<data[right]){
			temp[k++] = data[left++];
		}else{
			temp[k++] = data[right++];
		}
	}
	while(left <=mid){
		temp[k++] = data[left++];
	}
	while(right <=high){
		temp[k++] = data[right++];
	}
	for(int j=0;j<temp.length;j++){
		data[low + j] = temp[j];
	}
	}
public static void mergeSort(int[] data, int low, int high){
	int mid = (high + low)/2;
	if(low<high){
		mergeSort(data,low, mid);
		mergeSort(data,mid+1,high);
		merge(data,low, mid,high);
	}
}
public static void main(String[] args) {
	int[] data = {9,8,7,6,5,4,3,2,1};
	mergeSort(data,0,data.length-1);
	System.out.println(Arrays.toString(data));
	
}
}
