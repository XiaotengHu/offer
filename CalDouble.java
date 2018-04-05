package test;

import java.util.Scanner;

public class CalDouble {
public double calDouble(double base, int exponent){
	double result = 0;
	if( base == 0 && exponent != 0){
		return 0;
	}
	if(exponent == 0){
		return 1;
	}
	if(exponent > 0){
	result = cal(base,exponent);
	}else{
	result = cal(1/base,-exponent);
	}
	return result;
}
public double cal(double base, int exponent){
	double result = 1;
	for(int i = 0; i<exponent; i++){
		result *= base;
	}
	return result;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double base = sc.nextDouble();
	int exponent = sc.nextInt();
	CalDouble cd = new CalDouble();
	double result = cd.calDouble(base, exponent);
	System.out.println(result);
	sc.close();
	
}
}
