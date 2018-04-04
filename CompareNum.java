package test;

public class CompareNum {
	public int compareMin(int[] data){
		if(data == null || data.length ==0){
			return 0;
		}
		int left = 0;
		int right = data.length-1;
		int mid = 0;
		while(data[left] >= data[right]){
			if(right - left <= 1){
				mid = right;
				break;
			}
			mid = (right + left)/2;
			if(data[left] == data[mid] && data[mid] == data[right]){
				if(data[left +1] != data[right -1]){
					mid = data[left+1] < data[right-1] ? left+1 :right-1;
				}else{
					left ++;
					right --;
				}
			}else{
				if(data[left] <= data[mid]){
					left = mid;
				}else{
					right = mid;
				}
			}
		}
		return data[mid];
	}
	public static void main(String[] args) {
		int[] data = {3,2};
		CompareNum cn = new CompareNum();
		int result = cn.compareMin(data);
		System.out.println(result);
	}

}
