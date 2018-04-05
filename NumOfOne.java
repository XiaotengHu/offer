package test;

import java.util.Scanner;

public class NumOfOne {
public int numOfOne(int n){
	if(n == 0){
		return 0;
	}
	int count = 0;
	while(n !=0){
	 count ++;
	 n = n & (n-1);
	 }	
	 return count;
 }
public static void main(String[] args) {
	NumOfOne no = new NumOfOne();
	Scanner sc =  new Scanner(System.in);
	int n = sc.nextInt();
	int result = no.numOfOne(n);
	System.out.println(result);
	sc.close();
}
}
