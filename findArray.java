package test;

public class FindArray {
public boolean findNum(int[][] data, int num){
	if(data == null){
		return false;
	}
	int row = 0;
	int column = data[0].length - 1;
	
	while(row < data.length && column >=0){
	if(data[row][column] == num){
		return true;
	}
    if(data[row][column] >num){
    	column --;
	}else{
		row ++;
	}
	}
	return false;
	
}
public static void main(String[] args) {
	int[][] data = {{2,3,4},{3,4,5},{4,5,6}};
	FindArray find = new FindArray();
	boolean result = false;
	result = find.findNum(data, 3);
	System.out.println(result);
	
}
}
